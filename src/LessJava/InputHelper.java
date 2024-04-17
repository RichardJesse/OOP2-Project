
package LessJava;

import java.util.*;


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
