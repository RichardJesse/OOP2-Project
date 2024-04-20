package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MigrationTable {
    private DatabaseConnection dbConnection;

    public MigrationTable() {
        // Use DatabaseConnection for the database connection
        this.dbConnection = new DatabaseConnection();
    }

    public boolean hasRun(String migrationName) {
        // Check if a migration has been run
        try {
            Statement statement = dbConnection.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM migrations WHERE name = '" + migrationName + "'");
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void markAsRun(String migrationName) {
        // Mark a migration as run
        try {
            Statement statement = dbConnection.connection.createStatement();
            statement.executeUpdate("INSERT INTO migrations (name) VALUES ('" + migrationName + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
