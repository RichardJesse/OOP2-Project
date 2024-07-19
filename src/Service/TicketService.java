/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Database.QueryBuilder;
import Models.TicketModel;
import Models.TicketLevelModel;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class TicketService {

    public List<TicketLevelModel> getTicketLevelInfo(int eventId) {
        List<TicketLevelModel> ticketLevels = new ArrayList<>();

        QueryBuilder qb = new QueryBuilder();
        qb.select("*").from("ticket_level").where("event_id", "=", eventId);
        try {
            ResultSet rs = qb.build().executeQuery();
            while (rs.next()) {
                TicketLevelModel ticketLevel = new TicketLevelModel(
                        rs.getString("name"),
                        rs.getString("price"),
                        rs.getString("available_tickets")
                );
                ticketLevels.add(ticketLevel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ticketLevels;

    }

    private QueryBuilder queryBuilder = new QueryBuilder();

    public List<Map<String, Object>> getEventInfoForTicket(int ticketId) {
        String mainTable = "tickets";
        String[] mainTableColumns = {"tickets.id", "tickets.level_id"};
        String joinTable = "ticket_level";
        String[] joinTableColumns = {"ticket_level.event_id"};
        String whereColumn = "tickets.id";
        String joinCondition = "tickets.level_id = ticket_level.id";  // Correct join condition

        return queryBuilder.fetchRelatedData(mainTable, mainTableColumns, joinTable, joinCondition, joinTableColumns, whereColumn, ticketId);
    }

    /**
     * This function takes a list of maps as a parameter and prints all the keys
     * and values from each map in the list.
     *
     * @param list a list of maps containing keys and values
     * @return
     */
    public List<Map<String, Object>> printMaps(List<Map<String, Object>> list) {
        // Iterate over the list
        for (Map<String, Object> map : list) {
            // Iterate over the entries of each map
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // Access the key and value
                String key = entry.getKey();
                Object value = entry.getValue();

                // Print the key and value with appropriate formatting
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }

        return null;
    }

    public int getTotalAvailableTickets(int eventId) {
        int totalAvailableTickets = 0;
        QueryBuilder queryBuilder = new QueryBuilder();
        try {
            PreparedStatement statement = queryBuilder
                    .select("SUM(available_tickets) AS total_tickets")
                    .from("ticket_level")
                    .where("event_id", "=", eventId)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                totalAvailableTickets = resultSet.getInt("total_tickets");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalAvailableTickets;
    }

    public int getTotalPrice(int eventId) {
        int totalPrice = 0;

        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("SUM(price) AS total_price")
                    .from("ticket_level")
                    .where("event_id", "=", eventId)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                totalPrice = resultSet.getInt("total_tickets");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalPrice;
    }

    public int getAvailableTickets(int eventOrgId) {
        int totalAvailableTickets = 0;

        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("SUM(avaliable_tickets) AS total_tickets")
                    .from("event")
                    .where("event_organizer_id", "=", eventOrgId)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                totalAvailableTickets = resultSet.getInt("total_tickets");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalAvailableTickets;
    }

    public String getTicketSalesRevenue(int eventOrgId) {

        int ticketLevel = this.getTotalAvailableTickets(eventOrgId);
        int tickets = this.getAvailableTickets(eventOrgId);

        int price = this.getTotalPrice(eventOrgId);

        int calculateRevenue = price * (tickets - ticketLevel);

        return String.valueOf(calculateRevenue);

    }

}
