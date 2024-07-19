package Service;

import Database.QueryBuilder;
import Models.EventModel;
import Models.UserModel;
import Utils.SessionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventService {

    private static final String EVENT = "Event";

    public List<EventModel> searchEvents(String searchTerm) {
        List<EventModel> matchedEvents = new ArrayList<>();

        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("event")
                    .soundex("event_name", searchTerm)
                    .soundex("genre", searchTerm)
                    .soundex("event_description", searchTerm)
                    .build();

            System.out.println(statement);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String eventName = resultSet.getString("event_name");
                String genre = resultSet.getString("genre");
                String eventDescription = resultSet.getString("event_description");

                EventModel event = new EventModel(eventName, genre, eventDescription);
                matchedEvents.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return matchedEvents;
    }

    public EventModel getEventDetails(String eventName) {
        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("events")
                    .where("event_name", "=", eventName)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String genre = resultSet.getString("genre");
                String eventDescription = resultSet.getString("event_description");

                return new EventModel(eventName, genre, eventDescription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public EventModel getEvent() {
        return (EventModel) SessionManager.getInstance().getAttribute(EVENT);
    }

    public void removeEvent() {
        SessionManager.getInstance().removeAttribute(EVENT);
    }

    public List<EventModel> getAllEvents() {
        List<EventModel> allEvents = new ArrayList<>();

        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("event")
                    .build();

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String eventName = resultSet.getString("event_name");
                String genre = resultSet.getString("genre");
                String eventDescription = resultSet.getString("event_description");

                EventModel event = new EventModel(eventName, genre, eventDescription);
                allEvents.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allEvents;
    }

    public List<EventModel> getEventOrgEvents(int EventOrgId) {
        List<EventModel> allEvents = new ArrayList<>();

        QueryBuilder queryBuilder = new QueryBuilder();

        try {
            PreparedStatement statement = queryBuilder
                    .select("*")
                    .from("event")
                    .where("event_organizer_id", "=", EventOrgId)
                    .build();

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String eventName = resultSet.getString("event_name");
                String genre = resultSet.getString("genre");
                String eventDescription = resultSet.getString("event_description");
                String availableTickets = resultSet.getString("avaliable_tickets");

                EventModel event = new EventModel(eventName, genre, eventDescription, availableTickets);
                allEvents.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allEvents;
    }

    public String getTotalAvailableTickets(int eventOrgId) {
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

        return String.valueOf(totalAvailableTickets);
    }

}
