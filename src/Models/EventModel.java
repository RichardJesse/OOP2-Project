/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */
public class EventModel {

    private String eventName;
    private String genre;
    private String eventDescription;

    
    public EventModel(String eventName, String genre, String eventDescription) {
        this.eventName = eventName;
        this.genre = genre;
        this.eventDescription = eventDescription;
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


    @Override
    public String toString() {
        return "Event{"
                + "eventName='" + eventName + '\''
                + ", genre='" + genre + '\''
                + ", eventDescription='" + eventDescription + '\''
                + '}';
    }
}
