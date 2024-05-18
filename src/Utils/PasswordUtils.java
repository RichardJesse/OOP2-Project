/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.security.*;

/**
 *
 * @author user
 */
public class PasswordUtils {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String passwordToHash = "your_password_here";
        String salt = getSalt(); // Generate a random salt
        String securePassword = get_SHA_512_SecurePassword(passwordToHash, salt);
        System.out.println("Hashed Password: " + securePassword);
    }

    private static String get_SHA_512_SecurePassword(String password, String salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt.getBytes());
        byte[] hashedPassword = md.digest(password.getBytes());
        return bytesToHex(hashedPassword);
    }

    private static String getSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return bytesToHex(salt);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }
        return result.toString();
    }
}
    

