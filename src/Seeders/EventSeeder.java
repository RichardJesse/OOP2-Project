/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seeders;

import Database.Seeder;
import Factories.EventFactory;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class EventSeeder  extends Seeder {
    
    @Override
    public void run() throws SQLException {
        EventFactory eventFactory =  new EventFactory();
        eventFactory.create(20);
    }

    
}
