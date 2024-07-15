package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.Arrays;
import java.util.StringJoiner;

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
     * Performs a dynamic select query and returns a single value.
     *
     * @param table      The table name to select from.
     * @param column     The column to select.
     * @param conditionColumn  The column for the condition (e.g., "username").
     * @param conditionValue   The value for the condition (e.g., the username).
     * @return The value from the specified column.
     * @throws SQLException If a database access error occurs or the SQL execution fails.
     */
    public String selectSingleValue(String table, String column, String conditionColumn, Object conditionValue) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);

        try {
            QueryBuilder qb = queryBuilder.select(column)
                                           .from(table)
                                           .where(conditionColumn, "=", conditionValue);

            PreparedStatement preparedStatement = qb.build();
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();

            // Fetch the first value from the result set
            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return null; // No result found
            }
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    
      /**
     * Converts a ResultSet into a formatted String.
     *
     * @param resultSet The ResultSet to convert.
     * @return String representation of the ResultSet.
     * @throws SQLException If a database access error occurs.
     */
    private String resultSetToString(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        StringBuilder result = new StringBuilder();
        while (resultSet.next()) {
            StringJoiner row = new StringJoiner(", ");
            for (int i = 1; i <= columnCount; i++) {
                row.add(resultSet.getString(i));
            }
            result.append(row.toString()).append("\n");
        }
        return result.toString();
    }
    
     /**
     * Performs a dynamic select query and returns the ResultSet.
     *
     * @param table       The table name to select from.
     * @param columns     The columns to select.
     * @param conditions  The conditions to apply (e.g., "column = ?").
     * @param values      The values corresponding to the conditions.
     * @return ResultSet containing the results of the query.
     * @throws SQLException If a database access error occurs or the SQL execution fails.
     */
    public ResultSet selectRecords(String table, String[] columns, String[] conditions, Object[] values) throws SQLException {
        Connection connection = queryBuilder.dbconnection.connection;
        connection.setAutoCommit(false);

        try {
            QueryBuilder qb = queryBuilder.select(String.join(", ", columns))
                                           .from(table);
            
            // Add conditions if provided
            if (conditions != null && conditions.length > 0) {
                for (int i = 0; i < conditions.length; i++) {
                    qb = qb.where(conditions[i], "=", values[i]);
                }
            }

            PreparedStatement preparedStatement = qb.build();
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.commit();

            return resultSet;
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
                    .from(tableName)
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
