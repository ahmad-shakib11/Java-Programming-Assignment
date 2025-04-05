import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("Generated Password: " + generateSecurePassword());
    }

    public static String generateSecurePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category
        password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        // Fill remaining 4 characters with random choices from all categories
        String allChars = capitalLetters + smallLetters + digits + specialChars;
        for (int i = 4; i < 8; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the characters to make the password more random
        return shuffleString(password.toString());
    }

    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}