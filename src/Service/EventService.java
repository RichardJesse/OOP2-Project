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

    public UserModel getEvent() {
        return (UserModel) SessionManager.getInstance().getAttribute(EVENT);
    }

    public void removeEvent() {
        SessionManager.getInstance().removeAttribute(EVENT);
    }
}
