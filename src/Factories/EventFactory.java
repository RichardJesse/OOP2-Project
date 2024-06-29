/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Database.Factory;
import Enums.EventTypes;
import Models.EventModel;
import Database.Faker;

/**
 *
 * @author user
 */
public class EventFactory extends Factory<EventModel> {
    EventTypes eventTypes ;
    
    @Override
    protected EventModel generateModel() {
        return new EventModel(Faker.randomName(), Faker.randomName(), Faker.randomName());
    }
    
    @Override
    protected Object[] extractValues(EventModel event) {
        return new Object[]{event.getEventName(), event.getEventDescription(), Faker.randomNumber(1, 15), Faker.randomNumber(10, 1000), "2024-07-01 09:00:00", "2024-07-01 17:00:00" };
    }

    @Override
    protected String[] getColumns() {
        return new String[]{"event_name", "event_description","event_organizer_id", "avaliable_tickets" , "start_time", "end_date"};
    }

    @Override
    protected String getTableName() {
       return "event";
    }


    
}
