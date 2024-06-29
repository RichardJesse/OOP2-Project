package Database;

import java.security.SecureRandom;
import java.util.Random;
import Utils.PasswordUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Faker {
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[{]};:',<.>/?";
    private static final Random RANDOM = new SecureRandom();
    private static final Logger LOGGER = Logger.getLogger(Faker.class.getName());
    private static final PasswordUtils hash =  new PasswordUtils();

    public static String randomName() {
        return generateRandomString(5, 10); // Random name length between 5 to 10 characters
    }

    public static String randomEmail() {
        return generateRandomString(7, 12).toLowerCase() + "@" + generateRandomString(5, 8) + ".com";
    }

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    public static String securePassword() {
        StringBuilder password = new StringBuilder();
        password.append(generateRandomCharacter('0', '9')); // At least one digit
        password.append(generateRandomCharacter('a', 'z')); // At least one lowercase letter
        password.append(generateRandomCharacter('A', 'Z')); // At least one uppercase letter
        password.append(generateRandomSpecialCharacter());   // At least one special character
        for (int i = 0; i < 4; i++) { // Fill remaining length
            char randomChar = (char) RANDOM.nextInt(94 + 33);
            password.append(randomChar);
        }
        try {
            return hash.hashPassword(password.toString());
        } catch (Exception ex) {
            Logger.getLogger(Faker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    private static String generateRandomString(int minLength, int maxLength) {
        int length = RANDOM.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (RANDOM.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }

    private static char generateRandomSpecialCharacter() {
        int index = RANDOM.nextInt(SPECIAL_CHARACTERS.length());
        return SPECIAL_CHARACTERS.charAt(index);
    }

    private static char generateRandomCharacter(char start, char end) {
        return (char) (start + RANDOM.nextInt(end - start + 1));
    }
}
