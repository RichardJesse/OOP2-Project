/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Database.Factory;
import Models.TicketLevelModel;
import Database.Faker;
import Database.QueryBuilder;
import java.sql.*;

/**
 *
 * @author user
 */
public class TicketLevelFactory extends Factory<TicketLevelModel> {

    @Override
    protected TicketLevelModel generateModel() {
        return new TicketLevelModel(Faker.randomName(), "", "");
    }

    @Override
    protected String getTableName() {
        return "ticket_level";
    }

    @Override
    protected String[] getColumns() {
        return new String[]{"event_id", "name", "price", "available_tickets"};
    }

    @Override
    protected Object[] extractValues(TicketLevelModel ticketLevel) {
        return new Object[]{Faker.randomNumber(6, 30), ticketLevel.getName(), ticketLevel.getPrice(), this.getRemainingAvailableTickets(Faker.randomNumber(6, 30))};
    }

     private int fetchAvailableTicketsForEvent(int eventId) {
        QueryBuilder qb = new QueryBuilder();
        qb.select("avaliable_tickets").from("event").where("id", "=", eventId);
        try {
            ResultSet rs = qb.build().executeQuery();
            if (rs.next()) {
                return rs.getInt("avaliable_tickets");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int calculateTotalTicketsForEvent(int eventId) {
        QueryBuilder qb = new QueryBuilder();
        qb.select("SUM(available_tickets) as total_tickets").from("ticket_level").where("event_id", "=", eventId);
        try {
            ResultSet rs = qb.build().executeQuery();
            if (rs.next()) {
                return rs.getInt("total_tickets");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int getRemainingAvailableTickets(int eventId) {
        int availableTickets = fetchAvailableTicketsForEvent(eventId);
        int currentTickets = calculateTotalTicketsForEvent(eventId);
        return availableTickets - currentTickets;
    }

   

}
