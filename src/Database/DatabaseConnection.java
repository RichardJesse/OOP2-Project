package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    public Connection connection;

    public DatabaseConnection() {

        String url = DatabaseConstants.DatabaseURL;
        String databaseName = DatabaseConstants.Database;
        String username = DatabaseConstants.DatabaseUsername;
        String password = DatabaseConstants.DatabasePassword;

        System.out.println("Connecting to the database...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try {
          
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully!");

            // Check if the database exists and create it if not
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + databaseName);

            
            this.connection.setCatalog(databaseName);

        } catch (SQLException e) {
            System.out.println("Unable to connect to the database." + e.getMessage());
            e.printStackTrace();
        }

    }
}
