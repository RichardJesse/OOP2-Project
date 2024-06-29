/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Database.*;
import java.sql.*;

/**
 *
 * @author user
 */
public class UserModel {

    private String display_name;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public UserModel(String display_name, String email, String firstName, String password) {
        this.display_name = display_name;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

   

    // Getters and setters
    public String getUsername() {
        return display_name;
    }

    public void setUsername(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{"
                + "display_name='" + display_name + '\''
                + ", email='" + email + '\''
                + ", firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + '}';
    }

}
