package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class QueryBuilder {

    DatabaseConnection dbconnection = new DatabaseConnection();
    private StringBuilder query;
    private List<Object> parameters;
    private boolean hasWhereClause;

    public QueryBuilder() {
        this.query = new StringBuilder();
        this.parameters = new ArrayList<>();
        this.hasWhereClause = false;
    }

    public QueryBuilder select(String column) {
        query.append("SELECT ").append(column).append(" ");
        return this;
    }

    public QueryBuilder from(String table) {
        query.append("FROM ").append(table).append(" ");
        return this;
    }

    public QueryBuilder join(String table, String onClause) {
        query.append("JOIN ").append(table).append(" ON ").append(onClause).append(" ");
        return this;
    }

    public QueryBuilder where(String column, String operator, Object value) {
        if (!hasWhereClause) {
            query.append("WHERE ");
            hasWhereClause = true;
        } else {
            query.append("AND ");
        }
        query.append(column).append(" ").append(operator).append(" ? ");
        parameters.add(value);
        return this;
    }

    public QueryBuilder soundex(String column, String searchTerm) {
        if (query.indexOf("WHERE") == -1) {
            query.append("WHERE ");
        } else {
            query.append("OR ");
        }
        query.append("SOUNDEX(").append(column).append(") = SOUNDEX(?) ");
        parameters.add(searchTerm);
        return this;
    }

    public QueryBuilder orWhere(String column, String operator, Object value) {
        if (!hasWhereClause) {
            query.append("WHERE ");
            hasWhereClause = true;
        } else {
            query.append("OR ");
        }
        query.append(column).append(" ").append(operator).append(" ? ");
        parameters.add(value);
        return this;
    }

    public QueryBuilder insert(String table, String... columns) {
        query.append("INSERT INTO ").append(table);
        query.append("(").append(String.join(", ", columns)).append(") ");
        query.append("VALUES (");
        if (columns.length > 1) {
            query.append("?,".repeat(columns.length - 1));
        }
        query.append("?) ");
        return this;
    }

    public QueryBuilder values(Object... values) {
        parameters.addAll(Arrays.asList(values));
        return this;
    }

    public QueryBuilder update(String table) {
        query.append("UPDATE ").append(table).append(" ");
        return this;
    }

    public QueryBuilder set(String column, Object value) {
        query.append("SET ").append(column).append(" = ? ");
        parameters.add(value);
        return this;
    }

    public QueryBuilder deleteFrom(String table) {
        query.append("DELETE FROM ").append(table).append(" ");
        return this;
    }

    public String toString() {
        return query.toString().trim();
    }

    public PreparedStatement build() throws SQLException {
        PreparedStatement preparedStatement = dbconnection.connection.prepareStatement(query.toString());
        for (int i = 0; i < parameters.size(); i++) {
            preparedStatement.setObject(i + 1, parameters.get(i));
        }
        return preparedStatement;
    }

    // Abstract method to fetch related data
    public List<Map<String, Object>> fetchRelatedData(String mainTable, String[] mainTableColumns, String joinTable, String joinCondition, String[] joinTableColumns, String whereColumn, Object whereValue) {
        List<Map<String, Object>> results = new ArrayList<>();
        QueryBuilder qb = new QueryBuilder();

        // Build the query
        qb.select(String.join(", ", mainTableColumns) + ", " + String.join(", ", joinTableColumns))
          .from(mainTable)
          .join(joinTable, joinCondition)
          .where(whereColumn, "=", whereValue);

        // Print the query
        System.out.println("Executing Query: " + qb.toString());

        try {
            ResultSet rs = qb.build().executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                for (String column : mainTableColumns) {
                    row.put(column, rs.getObject(column));
                }
                for (String column : joinTableColumns) {
                    row.put(column, rs.getObject(column));
                }
                results.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return results;
    }
}
