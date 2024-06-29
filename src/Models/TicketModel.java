/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */
public class TicketModel {
    
    private String ticketNumber;
    private int ticketId;
    
    public TicketModel(String ticketNumber){
        this.ticketNumber = ticketNumber;
        
    }
    
    public void setId(int ticketId){
        this.ticketId = ticketId;
    }
    
    public int getId(){
        return ticketId;
    }
    
    public void setTicketNumber(String ticketNumber){
        this.ticketNumber = ticketNumber;
       
    }
    
    public String getTicketNumber(){
        return ticketNumber;
    }
    
      @Override
    public String toString() {
        return "Ticket{"
                + "ticket_id='" + ticketId + '\''
                + ",ticket_number='" + ticketNumber + '\''
               
                + '}';
    }
    
}
