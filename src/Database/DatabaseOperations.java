package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.Arrays;

public class DatabaseOperations {

    private QueryBuilder queryBuilder;

    public DatabaseOperations() {
        this.queryBuilder = new QueryBuilder();
    }

    /**
     *
     * @param table
     * @param columns
     * @param values
     * @throws SQLException
     */
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

    /**
     *
     * @param table
     * @param condition
     * @param operator
     * @param value
     * @throws SQLException
     */
    public void deleteRecord(String table, String condition, String operator, String value) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = queryBuilder
                    .deleteFrom(table)
                    .where(condition, operator, value)
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

    /**
     *
     * @param table
     * @param updates
     * @param condition
     * @param operator
     * @param conditionValue
     * @throws SQLException
     */
    public void updateRecord(String table, String updates, String condition, String operator, String conditionValue) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        try {
            String[] updatesArray = updates.split(",");
            for (String update : updatesArray) {
                String[] parts = update.split("=");
                queryBuilder.set(parts[0], parts[1]);
            }
            PreparedStatement preparedStatement = queryBuilder
                    .where(condition, operator, conditionValue)
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

    public boolean checkIfRecordExist(String tableName, String columnToCheck, String valueToLookFor) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);
        boolean recordExists = false;

        try {
            PreparedStatement preparedStatement = queryBuilder
                    .select(columnToCheck)
                    .where(columnToCheck, "=", valueToLookFor)
                    .build();

            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();

            // Check if the ResultSet is not empty
            recordExists = resultSet.next();

        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

        return recordExists;
    }

}
