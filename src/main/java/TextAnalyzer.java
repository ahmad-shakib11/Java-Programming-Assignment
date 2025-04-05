import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        int charCount = countCharacters(input);
        int vowelCount = countVowels(input);
        int consonantCount = charCount - vowelCount;

        System.out.println("\nAnalysis Results:");
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static int countCharacters(String str) {
        return str.replaceAll("\\s", "").length();
    }

    public static int countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}