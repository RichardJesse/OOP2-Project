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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketAppStartPage extends JFrame {
    private final JLabel lblAppName = null;
    private final JPanel navPanel;
    private final JButton btnUserFunction;
    private final JButton btnEventOrganizer;
    private final JTextField txtSearch;
    private final JButton btnLogout;

    
    public TicketAppStartPage() {
        setTitle("Tikopap - Start Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);


        // Application name label as background
        JLabel backgroundLabel = new JLabel("<html><center>Tikopap<br><br><br>Welcome to Tikopap!<br>Your go-to platform for all your event needs.</center></html>", SwingConstants.CENTER);
        backgroundLabel.setFont(new Font("Algerian", Font.BOLD, 40));
        backgroundLabel.setForeground(Color.decode("#FFD700")); // Grey color
        backgroundLabel.setBackground(Color.decode("#000000")); 
        backgroundLabel.setOpaque(true);
       
        
        // Navigation panel
        navPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        navPanel.setBackground(Color.decode("#e9e4f0"));
        setSize(800, 600);

        // Buttons and search bar
        btnUserFunction = new JButton("User Function");
        btnEventOrganizer = new JButton("Event Organizer");
        txtSearch = new JTextField(20);
        JButton btnSearch = new JButton("Search");
        btnLogout = new JButton("Logout");

        // Add components to navigation panel
        navPanel.add(btnUserFunction);
        navPanel.add(btnEventOrganizer);
        navPanel.add(txtSearch);
        navPanel.add(btnSearch);
        navPanel.add(btnLogout);

        // Add components to frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);
        getContentPane().add(navPanel, BorderLayout.NORTH);

        // Set visibility
        setVisible(true);

        // Action listeners
        btnUserFunction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action for user function button
            }
        });

        btnEventOrganizer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action for event organizer button
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action for search button
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action for logout button
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicketAppStartPage();
            }
        });
    }
}
