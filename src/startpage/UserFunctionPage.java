/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startpage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserFunctionPage extends JFrame {

    // Define colors
    private Color lightGray = Color.decode("#bdc3c7");
    
    public UserFunctionPage() {
        setTitle("User Function Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to return to start page
        setSize(800, 600);
        getContentPane().setBackground(lightGray); // Set background color

        // Panels for upcoming and ongoing events
        JPanel upcomingEventsPanel = createEventsGroupPanel("Upcoming Events",
                "Event 1", "Description 1", "images/event1.jpeg", EventPage1.class,
                "Event 2", "Description 2", "images/event2.jpeg", EventPage2.class);

        JPanel ongoingEventsPanel = createEventsGroupPanel("Ongoing Events",
                "Event A", "Description A", "images/event3.jpeg", EventPageA.class,
                "Event B", "Description B", "images/event4.jpeg", EventPageB.class);

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
    private JPanel createEventsGroupPanel(String groupName, Object... eventsData) {
        JPanel groupPanel = new JPanel(new GridLayout(1, 2, 10, 10)); // 1 row, 2 columns, gaps of 10
        groupPanel.setBackground(lightGray); // Set background color
        groupPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(lightGray, 2), groupName)); // Group panel border

        // Create event panels
        for (int i = 0; i < eventsData.length; i += 4) {
            String eventName = (String) eventsData[i];
            String eventDescription = (String) eventsData[i + 1];
            String eventImagePath = (String) eventsData[i + 2];
            Class<? extends JFrame> eventPageClass = (Class<? extends JFrame>) eventsData[i + 3];

            JPanel eventPanel = createEventPanel(eventName, eventDescription, eventImagePath, eventPageClass);
            groupPanel.add(eventPanel);
        }

        return groupPanel;
    }

    // Method to create event panel with image and clickable functionality
    private JPanel createEventPanel(String eventName, String eventDescription, String eventImagePath, Class<? extends JFrame> eventPageClass) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.white); // Set panel background color
        panel.setBorder(BorderFactory.createLineBorder(lightGray, 1)); // Set panel border

        // Load and add image (you may adjust the image loading part as needed)
        try {
            ImageIcon icon = new ImageIcon(eventImagePath);
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle image loading error
        }

        // Add event name label
        JLabel nameLabel = new JLabel(eventName);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nameLabel, BorderLayout.NORTH);

        // Add event description label
        JLabel descriptionLabel = new JLabel("<html><body style='width: 100px'>" + eventDescription + "</body></html>");
        descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(descriptionLabel, BorderLayout.SOUTH);

        // Add mouse listener to make panel clickable
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    // Open event page based on eventPageClass within the same frame
                    JFrame eventPage = eventPageClass.getDeclaredConstructor(JFrame.class).newInstance(UserFunctionPage.this);
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

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(UserFunctionPage::new);
    }
}
