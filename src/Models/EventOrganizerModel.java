/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */
public class EventOrganizerModel {
    
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private int orgId;

    public EventOrganizerModel(int orgId ,String name, String email, String password, String phoneNumber) {
        this.email = email;
        this.orgId = orgId;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }
   public EventOrganizerModel(String name, String email, String password, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {
        return email;
    }
    
    public int getId(){
        return orgId;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getName() {
        return name;
    }
    
    public void setId(int orgId){
        this.orgId = orgId;
    }
    
    public void setName(String name) {
        this.name = name;

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return "Event_Organizer{"
                +"organizer_id ='" + orgId + '\''
                + "name='" + name + '\''
                + ", email='" + email + '\''
                + ", phone_number='" + phoneNumber + '\''
                + '}';
    }

}
