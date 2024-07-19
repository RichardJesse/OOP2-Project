/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class EventModel {

    private String eventName;
    private String genre;
    private String eventDescription;
    private String availableTickets;
    private int eventId;
    private Class<? extends JFrame> eventPageClass;

    
    public EventModel(String eventName, String genre, String eventDescription) {
        this.eventName = eventName;
        this.genre = genre;
        this.eventDescription = eventDescription;
    }

    public EventModel(String eventName, String genre, String eventDescription, String availableTickets) {
        this.eventName = eventName;
        this.genre = genre;
        this.eventDescription = eventDescription;
        this.availableTickets = availableTickets;
        this.eventPageClass = eventPageClass;
    }
    
     public EventModel(String eventName, String genre, String eventDescription, String availableTickets,  Class<? extends JFrame> eventPageClass) {
        this.eventName = eventName;
        this.genre = genre;
        this.eventDescription = eventDescription;
        this.availableTickets = availableTickets;
    }
    
    public String getAvailableTickets(){
        return availableTickets;
    }

    public int getId(){
        return eventId;
    }
    
    public void setId(int eventId){
        this.eventId = eventId;
    }
    
    public String getEventName() {
        return eventName;
    }

    public String getGenre() {
        return genre;
    }

    public String getEventDescription() {
        return eventDescription;
    }
    
    public Class<? extends JFrame> getEventPageClass() {
        return eventPageClass;
    }


    @Override
    public String toString() {
        return "Event{"
                +"event_id= '" + eventId + '\''
                + "eventName='" + eventName + '\''
                + ", genre='" + genre + '\''
                + ", eventDescription='" + eventDescription + '\''
                + ", availableTickets='" + availableTickets + '\''
                + '}';
    }
}
