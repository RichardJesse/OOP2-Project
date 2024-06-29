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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UserAuthenticator {

    QueryBuilder qb = new QueryBuilder();
    PasswordUtils passwordHasher = new PasswordUtils();

    public boolean CheckPasswordAndUserName(String username, String password) {
        try {
            PreparedStatement statement = qb.select("password").from("users").where("first_name", "=", username).build();
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String passwordResult = resultSet.getString("password");
                boolean passState = passwordHasher.verifyPassword(password, passwordResult);
                if(passState){
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
                if(passState){
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

}
