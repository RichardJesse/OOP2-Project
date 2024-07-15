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

public class EventPage2 extends JFrame {

    public EventPage2(JFrame parentFrame) {
        setTitle("Event 2 Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        getContentPane().setBackground(Color.darkGray);
        setLayout(new BorderLayout());

        // Event details panel
        JPanel detailsPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        detailsPanel.setBackground(Color.darkGray);
        detailsPanel.setBorder(new EmptyBorder(30, 30, 30, 30));

        // Event details
        JLabel eventNameLabel = new JLabel("Event 2");
        eventNameLabel.setForeground(Color.white);
        eventNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(eventNameLabel);

        JLabel hostLabel = new JLabel("Host: Emily Brown");
        hostLabel.setForeground(Color.white);
        hostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(hostLabel);

        JLabel dateLabel = new JLabel("Date: July 17, 2024");
        dateLabel.setForeground(Color.white);
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(dateLabel);

        JLabel timeLabel = new JLabel("Time: 3:00 PM");
        timeLabel.setForeground(Color.white);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(timeLabel);

        JLabel venueLabel = new JLabel("Venue: Grand Hall");
        venueLabel.setForeground(Color.white);
        venueLabel.setHorizontalAlignment(SwingConstants.CENTER);
        detailsPanel.add(venueLabel);

        // Buy ticket button
        JButton buyTicketButton = new JButton("Buy a Ticket");
        buyTicketButton.addActionListener(e -> JOptionPane.showMessageDialog(EventPage2.this, "Redirecting to ticket purchase page..."));
        detailsPanel.add(buyTicketButton);

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            parentFrame.getContentPane().removeAll();
            parentFrame.getContentPane().add(new UserFunctionPage().getContentPane());
            parentFrame.revalidate();
            parentFrame.repaint();
        });
        detailsPanel.add(closeButton);

        // Add details panel to the left
        add(detailsPanel, BorderLayout.WEST);

        // Add event image on the right side
        ImageIcon eventImage = new ImageIcon("images/event2.jpeg");
        JLabel imageLabel = new JLabel(eventImage);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EventPage2(new JFrame()));
    }
}
