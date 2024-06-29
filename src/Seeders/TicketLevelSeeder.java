/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seeders;
import Database.Seeder;
import java.sql.SQLException;
import Factories.TicketLevelFactory;
/**
 *
 * @author user
 */
public class TicketLevelSeeder extends Seeder {
    
    @Override
    public void run() throws SQLException {
        TicketLevelFactory ticketLevel = new TicketLevelFactory();
        ticketLevel.create(20);
       
    }
    
    
}
