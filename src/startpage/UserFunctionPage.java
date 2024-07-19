package startpage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import Database.QueryBuilder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.EventModel;

public class UserFunctionPage extends JFrame {

    // Define colors
    private Color lightGray = Color.decode("#bdc3c7");

    public UserFunctionPage() {
        setTitle("User Function Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to return to start page
        setSize(800, 600);
        getContentPane().setBackground(lightGray); // Set background color

        // Panels for upcoming and ongoing events
        JPanel upcomingEventsPanel = createEventsGroupPanel("Upcoming Events", getEvents("upcoming"));
        JPanel ongoingEventsPanel = createEventsGroupPanel("Ongoing Events", getEvents("ongoing"));

        // Main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1, 10, 10)); // 2 rows, 1 column, gaps of 10
        contentPanel.setBackground(lightGray); // Set background color
        contentPanel.setBorder(new EmptyBorder(30, 30, 30, 30)); // Padding
        contentPanel.add(upcomingEventsPanel);
        contentPanel.add(ongoingEventsPanel);

        getContentPane().add(contentPanel, BorderLayout.CENTER);

        // Set visibility
        setVisible(true);
    }

    // Method to create panel for events group (upcoming or ongoing)
    private JPanel createEventsGroupPanel(String groupName, List<EventModel> events) {
        JPanel groupPanel = new JPanel(new GridLayout(events.size(), 1, 10, 10)); // rows for each event, 1 column, gaps of 10
        groupPanel.setBackground(lightGray); // Set background color
        groupPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(lightGray, 2), groupName)); // Group panel border

        // Create event panels
        for (EventModel event : events) {
            JPanel eventPanel = createEventPanel(event);
            groupPanel.add(eventPanel);
        }

        return groupPanel;
    }

    // Method to create event panel with image and clickable functionality
    private JPanel createEventPanel(EventModel event) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.white); // Set panel background color
        panel.setBorder(BorderFactory.createLineBorder(lightGray, 1)); // Set panel border

        // Load and add image (you may adjust the image loading part as needed)
        try {
            ImageIcon icon = new ImageIcon(event.getEventDescription());
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle image loading error
        }

        // Add event name label
        JLabel nameLabel = new JLabel(event.getEventName());
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nameLabel, BorderLayout.NORTH);

        // Add event description label
        JLabel descriptionLabel = new JLabel("<html><body style='width: 100px'>" + event.getEventDescription() + "</body></html>");
        descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(descriptionLabel, BorderLayout.SOUTH);

        // Add mouse listener to make panel clickable
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    // Open event page based on eventPageClass within the same frame
                    JFrame eventPage = event.getEventPageClass().getDeclaredConstructor(JFrame.class).newInstance(UserFunctionPage.this);
                    getContentPane().removeAll(); // Remove current content
                    getContentPane().add(eventPage.getContentPane()); // Add event page content
                    revalidate(); // Refresh the frame
                } catch (Exception ex) {
                    ex.printStackTrace();
                    // Handle error
                }
            }
        });

        return panel;
    }

    private List<EventModel> getEvents(String eventType) {
    List<EventModel> events = new ArrayList<>();
    QueryBuilder queryBuilder = new QueryBuilder();
    try {
        String eventStatusQuery = eventType.equals("upcoming") ? "start_time > NOW()" : "start_time <= NOW() AND end_date >= NOW()";
        PreparedStatement statement = queryBuilder
                .select("id, event_name, event_description, event_poster_path")
                .from("event")
                .where("start_time", eventType.equals("upcoming") ? ">" : "<=", "NOW()")
                .where("end_date", ">=", "NOW()")
                .build();

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("event_name");
            String genre = resultSet.getString("event_name");
            String description = resultSet.getString("event_description");
            String imagePath = resultSet.getString("event_poster_path");

            // Assuming you have EventPage classes like EventPage1, EventPage2, etc.
            Class<? extends JFrame> eventPageClass = getEventPageClassById(id);

            EventModel event = new EventModel(name, genre,description, imagePath, eventPageClass);
            events.add(event);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return events;
}

    private Class<? extends JFrame> getEventPageClassById(int eventId) {
        // This method should return the correct EventPage class based on the event ID
        // Replace this with your actual logic to determine the class
        switch (eventId) {
            case 1: return EventPage1.class;
            case 2: return EventPage2.class;
            case 3: return EventPageA.class;
            case 4: return EventPageB.class;
            default: return EventPageB.class ;
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(UserFunctionPage::new);
    }
}