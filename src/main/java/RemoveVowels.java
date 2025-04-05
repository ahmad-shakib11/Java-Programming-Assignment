import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeVowels(input);
        System.out.println("Output: " + result);
    }

    public static String removeVowels(String str) {
        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Define vowels (both lowercase and uppercase)
        String vowels = "AEIOUaeiou";

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Append to result only if it's not a vowel
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString().trim(); // trim to remove any leading/trailing spaces
    }
}