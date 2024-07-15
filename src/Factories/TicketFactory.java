/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Database.Factory;
import Database.Faker;
import Models.TicketModel;
import Utils.TicketNumberGenerator;

/**
 *
 * @author user
 */
public class TicketFactory extends Factory<TicketModel> {

    @Override
    protected TicketModel generateModel() {
       return new TicketModel(TicketNumberGenerator.generateUniqueTicketNumber());
    }

    @Override
    protected String getTableName() {
        return "tickets";
    }

    @Override
    protected String[] getColumns() {
       return new String[]{"user_id", "level_id", "ticket_number"};
    }

    @Override
    protected Object[] extractValues(TicketModel model) {
        return new Object[]{Faker.randomNumber(44, 47), Faker.randomNumber(41, 60), model.getTicketNumber()};
    }

    
}
