
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryBuilder {

    
     DatabaseConnection dbconnection = new DatabaseConnection();
    private StringBuilder query;
    private List<Object> parameters;

    public QueryBuilder() {
        this.query = new StringBuilder();
        this.parameters = new ArrayList<>();
    }

    public QueryBuilder select(String column) {
        query.append("SELECT ").append(column).append(" ");
        return this;
    }

    public QueryBuilder from(String table) {
        query.append("FROM ").append(table).append(" ");
        return this;
    }

    public QueryBuilder where(String condition, Object value) {
        query.append("WHERE ").append(condition).append(" = ? ");
        parameters.add(value);
        return this;
    }

    public QueryBuilder insert(String table, String... columns) {
        query.append("INSERT INTO ").append(table);
        query.append("(").append(String.join(", ", columns)).append(") ");
        query.append("VALUES (").append("?,".repeat(columns.length - 1)).append("?) ");
        return this;
    }

    public QueryBuilder values(Object... values) {
        for (Object value : values) {
            parameters.add(value);
        }
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

    public PreparedStatement build() throws SQLException {
        PreparedStatement preparedStatement = dbconnection.connection.prepareStatement(query.toString());
        for (int i = 0; i < parameters.size(); i++) {
            preparedStatement.setObject(i + 1, parameters.get(i));
        }
        return preparedStatement;
    }
}
