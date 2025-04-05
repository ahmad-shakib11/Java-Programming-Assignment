import java.util.Scanner;

public class BabyHeightAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[10];

        // Input 10 baby heights
        System.out.println("Enter heights of 10 babies (in cm):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Baby " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        scanner.close();

        // Find two lowest heights
        double[] twoLowest = findTwoLowest(heights);

        // Display results
        System.out.println("\nThe two lowest heights are:");
        System.out.println("1. " + twoLowest[0] + " cm");
        System.out.println("2. " + twoLowest[1] + " cm");
    }

    public static double[] findTwoLowest(double[] heights) {
        // Initialize with first two elements (sorted)
        double lowest = Math.min(heights[0], heights[1]);
        double secondLowest = Math.max(heights[0], heights[1]);

        // Check remaining elements
        for (int i = 2; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest) {
                secondLowest = heights[i];
            }
        }

        return new double[]{lowest, secondLowest};
    }
}