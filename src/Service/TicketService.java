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
   public List<TicketLevelModel> getTicketLevelInfo(int eventId){
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
    
}
