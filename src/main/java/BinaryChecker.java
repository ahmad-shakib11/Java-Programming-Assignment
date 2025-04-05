import java.util.Scanner;

public class BinaryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's binary: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isBinary = isBinaryString(input);
        System.out.println("Output: " + isBinary);
    }

    public static boolean isBinaryString(String str) {
        // Check if string is empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character in the string
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}