package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class DatabaseOperations {

    private QueryBuilder queryBuilder;

    public DatabaseOperations() {
        this.queryBuilder = new QueryBuilder();
    }

    public void insertRecord(String table, String columns, String values) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        try {
            String[] columnsArray = columns.split(",");
            String[] valuesArray = values.split(",");
            PreparedStatement preparedStatement = queryBuilder
                    .insert(table, columnsArray)
                    .values((Object[]) valuesArray)
                    .build();
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void deleteRecord(String table, String condition, String value) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = queryBuilder
                    .deleteFrom(table)
                    .where(condition, value)
                    .build();
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void updateRecord(String table, String updates, String condition, String conditionValue) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        try {
            String[] updatesArray = updates.split(",");
            for (String update : updatesArray) {
                String[] parts = update.split("=");
                queryBuilder.set(parts[0], parts[1]);
            }
            PreparedStatement preparedStatement = queryBuilder
                    .where(condition, conditionValue)
                    .build();
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
