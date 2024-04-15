/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LessJava;

import java.util.*;

/**
 *
 * @author user
 */
public class InputHelper {
    
     private Scanner scanner;

    public InputHelper() {
        this.scanner = new Scanner(System.in);
    }

    public String getInputString (String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
    
}
