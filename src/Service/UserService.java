/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Database.QueryBuilder;
import Models.UserModel;
import Utils.SessionManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class UserService {

    private static final String CURRENT_USER_KEY = "currentUser";

    public UserModel getCurrentUserDetails(String email) {

        QueryBuilder queryBuilder = new QueryBuilder();

        try {

            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("users")
                    .where("email", "=", email)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String display_name = resultSet.getString("display_name");
                String userEmail = resultSet.getString("email");
                String firstName = resultSet.getString("first_name");
//                String lastName = resultSet.getString("last_name");

                return new UserModel(display_name, userEmail, firstName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public void setCurrentUserByEmail(String email) {
        UserModel user = getCurrentUserDetails(email);
        if (user != null) {
            SessionManager.getInstance().setAttribute(CURRENT_USER_KEY, user);
        } else {
            System.out.println("User not found with email: " + email);
        }
    }

    public UserModel getCurrentUser() {
        return (UserModel) SessionManager.getInstance().getAttribute(CURRENT_USER_KEY);
    }

    public void removeCurrentUser() {
        SessionManager.getInstance().removeAttribute(CURRENT_USER_KEY);
    }

}
