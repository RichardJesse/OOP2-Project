/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.UUID;
import java.time.*;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class TicketNumberGenerator {

    public static String generateUniqueIdentifier() {
        UUID uniqueID = UUID.randomUUID();

        return uniqueID.toString();
    }

    public static void main(String[] args) {
        String uniqueID = generateUniqueIdentifier();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("Generated Unique Identifier: " + uniqueID);
    }

}
