package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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

    public QueryBuilder where(String column, String operator, Object value) {
        query.append("WHERE ").append(column).append(" ").append(operator).append(" ?  ");
        parameters.add(value);
        return this;
    }

    public QueryBuilder where(String condition) {
        query.append("WHERE ").append(condition).append("  ");
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
        System.out.println("Final SQL query: " + query.toString());
        for (int i = 0; i < parameters.size(); i++) {
            preparedStatement.setObject(i + 1, parameters.get(i));
        }
        return preparedStatement;
    }

}
