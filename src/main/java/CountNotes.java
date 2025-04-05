import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        // Available currency notes in descending order
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Get amount from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to break down: ");
        int amount = scanner.nextInt();
        scanner.close();

        // Calculate and display note breakdown
        System.out.println("\nNote Breakdown:");
        calculateNotes(amount, notes);
    }

    public static void calculateNotes(int amount, int[] notes) {
        int remainingAmount = amount;

        for (int note : notes) {
            if (remainingAmount >= note) {
                int count = remainingAmount / note;
                System.out.printf("%4d note(s) : %d\n", note, count);
                remainingAmount %= note;

                // Early exit if amount is fully broken down
                if (remainingAmount == 0) {
                    break;
                }
            }
        }

        if (remainingAmount > 0) {
            System.out.println("(Remaining: " + remainingAmount + " cannot be broken down)");
        }
    }
}