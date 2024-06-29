/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seeders;

import Database.Seeder;
import Factories.EventOrganizerFactory;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class EventOrganizerSeeder extends Seeder {
    
    @Override
    public void run() throws SQLException {
        EventOrganizerFactory eventOrgFactory = new EventOrganizerFactory();
        eventOrgFactory.create(10);
    }

    
}
