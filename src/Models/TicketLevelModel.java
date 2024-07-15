/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */
public class TicketLevelModel {
    private String name;
    private String price;
    private String availableTickets;
    
    public TicketLevelModel(String name, String price, String availableTickets){
        this.name = name;
        this.price = price;
        this.availableTickets = availableTickets;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(String price){
        this.price = price;
        
    }
    
    public String getPrice(){
        return price;
    }
    
    public void setAvailableTickets(String availableTickets){
        this.availableTickets = availableTickets;
    }
    
    public String getAvailableTickets(){
        return availableTickets;
    }
    
    @Override
    public String toString() {
        return "Ticket_level{"
                + "name='" + name + '\''
                + ", price='" + price + '\''
                + ", available_tickets='" + availableTickets + '\''
                + '}';
    }
    
}
