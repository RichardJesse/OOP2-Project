/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class PasswordUtils {

    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;
    private static final int SALT_LENGTH = 16;

    // Hashes the password with a generated salt
    public String hashPassword(String password) throws Exception {
        byte[] salt = generateSalt();
        byte[] hash = pbkdf2(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
        return Base64.getEncoder().encodeToString(salt) + ":" + Base64.getEncoder().encodeToString(hash);
    }

    // Verifies the password against the stored hash
    public boolean verifyPassword(String password, String storedHash) throws Exception {
        String[] parts = storedHash.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Stored hash is not in the correct format");
        }
        byte[] salt = Base64.getDecoder().decode(parts[0]);
        byte[] hash = Base64.getDecoder().decode(parts[1]);

        byte[] testHash = pbkdf2(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
        return Arrays.equals(hash, testHash);
    }

    // Generates a random salt
    private byte[] generateSalt() throws Exception {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_LENGTH];
        random.nextBytes(salt);
        return salt;
    }

    // Hashes the password using PBKDF2 with the provided salt
    private byte[] pbkdf2(char[] password, byte[] salt, int iterations, int keyLength) throws Exception {
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        return skf.generateSecret(spec).getEncoded();
    }
    
    public static void main(String[] args) {
        try {
            PasswordUtils hasher = new PasswordUtils();
            String password = "mySecurePassword";
            String hashedPassword = hasher.hashPassword(password);
            System.out.println("Hashed Password: " + hashedPassword);

            boolean isPasswordCorrect = hasher.verifyPassword(password, hashedPassword);
            System.out.println("Password verification: " + isPasswordCorrect);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
