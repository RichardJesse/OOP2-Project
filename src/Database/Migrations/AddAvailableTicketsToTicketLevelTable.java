/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Migrations;
import Database.*;

/**
 *
 * @author user
 */
public class AddAvailableTicketsToTicketLevelTable extends Migration {
     @Override
    public void up() {
      addColumn("ticket_level", "available_tickets", "VARCHAR(255)");
         }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
    
}
