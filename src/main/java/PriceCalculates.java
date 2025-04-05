import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceCalculates {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        // Improved price extraction - looks for numbers after "price is"
        int laptopPrice = extractPriceAfter(paragraph, "laptop price is");
        int mousePrice = extractPriceAfter(paragraph, "mouse price is");

        // Calculate costs
        int subtotal = laptopPrice + mousePrice;
        double discount = subtotal * 0.15;
        double total = subtotal - discount;

        // Display results
        System.out.println("Price Breakdown:");
        System.out.println("Laptop: " + laptopPrice + " tk");
        System.out.println("Mouse: " + mousePrice + " tk");
        System.out.println("Subtotal: " + subtotal + " tk");
        System.out.println("Discount (15%): " + discount + " tk");
        System.out.println("Total to pay: " + total + " tk");
    }

    private static int extractPriceAfter(String text, String prefix) {
        // Create pattern to find number after specific phrase
        Pattern pattern = Pattern.compile(Pattern.quote(prefix) + "\\s*(\\d+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
}