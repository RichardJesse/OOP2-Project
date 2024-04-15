/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DatabaseConnection {

    public Connection connection;

    public DatabaseConnection() {

        String url = "jdbc:mysql://localhost:3306/multiviewatm";
        String username = "root";
        String password = "";

        System.out.println("Connecting to the database...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database." + e.getMessage());
            e.printStackTrace();
        }

    }
}
