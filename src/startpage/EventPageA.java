/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startpage;

/**
 *
 * @author hp
 */


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EventPageA extends JFrame {

    public EventPageA(JFrame parentFrame) {
        setTitle("Event A Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        getContentPane().setBackground(Color.darkGray);
        setLayout(new BorderLayout());

        // Event details panel
        JPanel detailsPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        detailsPanel.setBackground(Color.darkGray);
        detailsPanel.setBorder(new EmptyBorder(30, 30, 30, 30));

        // Event details
        JLabel eventNameLabel = new JLabel("Event A");
        eventNameLabel.setForeground(Color.white);
        eventNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(eventNameLabel);

        JLabel hostLabel = new JLabel("Host: Sarah Johnson");
        hostLabel.setForeground(Color.white);
        hostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(hostLabel);

        JLabel dateLabel = new JLabel("Date: July 16, 2024");
        dateLabel.setForeground(Color.white);
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(dateLabel);

        JLabel timeLabel = new JLabel("Time: 2:00 PM");
        timeLabel.setForeground(Color.white);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(timeLabel);

        JLabel venueLabel = new JLabel("Venue: Main Hall");
        venueLabel.setForeground(Color.white);
        venueLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(venueLabel);

        // Buy ticket button
        JButton buyTicketButton = new JButton("Buy a Ticket");
        buyTicketButton.addActionListener(e -> JOptionPane.showMessageDialog(EventPageA.this, "Redirecting to ticket purchase page..."));
        detailsPanel.add(buyTicketButton);

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            dispose(); // Close the current EventPageA frame
            parentFrame.setVisible(true); // Make UserFunctionPage frame visible again
        });
        detailsPanel.add(closeButton);

        // Add details panel to the left
        add(detailsPanel, BorderLayout.WEST);

        // Add event image on the right side
        ImageIcon eventImage = new ImageIcon("images/event3.jpeg");
        JLabel imageLabel = new JLabel(eventImage);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EventPageA(new UserFunctionPage()));
    }
}
