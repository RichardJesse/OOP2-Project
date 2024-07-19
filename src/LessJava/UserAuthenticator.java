/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LessJava;

import Database.DatabaseOperations;
import Database.QueryBuilder;
import loginForm.login;
import Utils.PasswordUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UserAuthenticator {

    QueryBuilder qb = new QueryBuilder();
    PasswordUtils passwordHasher = new PasswordUtils();

    public boolean CheckPasswordAndEmail(String email, String password, String table) {
        try {
            PreparedStatement statement = qb.select("password").from(table).where("email", "=", email).build();
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String passwordResult = resultSet.getString("password");
                boolean passState = passwordHasher.verifyPassword(password, passwordResult);
                if (passState) {
                    return true;
                }

                return false;

            } else {
                return false;
            }

        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    public boolean CheckPasswordAndName(String email, String password) {
        try {
            PreparedStatement statement = qb.select("password").from("event_organizer").where("email", "=", email).build();
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String passwordResult = resultSet.getString("password");
                boolean passState = passwordHasher.verifyPassword(password, passwordResult);
                if (passState) {
                    return true;
                }

                return false;

            } else {
                return false;
            }

        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    public boolean SignUpUser(String email, String username, String password,String phoneNumber, String table) throws SQLException {

        try {
            String hashedPassword = passwordHasher.hashPassword(password);
            if (table.equals("users")) {
                PreparedStatement statement = qb.insert(table, "email", "name", "display_name", "password", "phone_number").values(email, username, username, hashedPassword, phoneNumber).build();
                statement.execute();
            }
            if (table.equals("event_organizer")) {
                PreparedStatement statement = qb.insert(table, "email", "name", "password", "primary_phone_number").values(email, username, hashedPassword, phoneNumber).build();
                statement.execute();
            }

            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
