/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seeders;

import Database.Seeder;
import java.sql.SQLException;
import Factories.TicketFactory;

/**
 *
 * @author user
 */
public class TicketSeeder extends Seeder {
  

    @Override
    public void run() throws SQLException {
        TicketFactory ticket = new TicketFactory();
        ticket.create(20);
       
    }

    
}
