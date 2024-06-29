/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Database.Factory;
import Models.EventOrganizerModel;
import Database.Faker;

/**
 *
 * @author user
 */
public class EventOrganizerFactory extends Factory<EventOrganizerModel> {
    
     @Override
    protected EventOrganizerModel generateModel() {
        return new EventOrganizerModel(Faker.randomName(),Faker.randomEmail(), Faker.securePassword(), Faker.phoneNumber());
        
    }
    @Override
    protected String getTableName() {
       return "event_organizer";
    }
    
   

    @Override
    protected String[] getColumns() {
       return new String[]{"name", "email", "password", "primary_phone_number"};
    }

    
    
     @Override
    protected Object[] extractValues(EventOrganizerModel eventOrg) {
        return new Object[]{eventOrg.getName(), eventOrg.getEmail(), eventOrg.getPassword(), eventOrg.getPhoneNumber()};
    }

    
}
