/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.UUID;


public class TicketNumberGenerator {

    public static String generateUniqueTicketNumber() {
        UUID uniqueID = UUID.randomUUID();
        return uniqueID.toString();
    }

}
