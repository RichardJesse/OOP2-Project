/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Database.QueryBuilder;
import Models.UserModel;
import Models.EventOrganizerModel;
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
    private static final String CURRENT_EVENT_ORG = "currentOrganizer";

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
                int userId = resultSet.getInt("id");
                String display_name = resultSet.getString("display_name");
                String userEmail = resultSet.getString("email");
                String firstName = resultSet.getString("first_name");
//                String lastName = resultSet.getString("last_name");
                String password = null;

                return new UserModel(userId, display_name, userEmail, firstName, password);
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
    
    public void setCurrentOrganizerByEmail(String email) {
        EventOrganizerModel user = getCurrentOrganizerDetails(email);
        if (user != null) {
            SessionManager.getInstance().setAttribute(CURRENT_EVENT_ORG, user);
        } else {
            System.out.println("User not found with email: " + email);
        }
    }
    
    public EventOrganizerModel getCurrentOrganizerDetails(String email) {

        QueryBuilder queryBuilder = new QueryBuilder();

        try {

            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("event_organizer")
                    .where("email", "=", email)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String userEmail = resultSet.getString("email");
                String phoneNumber = resultSet.getString("primary_phone_number");

                String password = null;

                return new EventOrganizerModel(userId,name,userEmail,password,phoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public UserModel getCurrentUser() {
        return (UserModel) SessionManager.getInstance().getAttribute(CURRENT_USER_KEY);
    }
    
    public EventOrganizerModel getCurrentOrganizer(){
        return (EventOrganizerModel) SessionManager.getInstance().getAttribute(CURRENT_EVENT_ORG); 
    }
    public void removeCurrentOrganizer() {
        SessionManager.getInstance().removeAttribute(CURRENT_EVENT_ORG);
    }

    public void removeCurrentUser() {
        SessionManager.getInstance().removeAttribute(CURRENT_USER_KEY);
    }

}
