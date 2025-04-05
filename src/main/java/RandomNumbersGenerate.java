import java.util.Random;

public class RandomNumbersGenerate {
    public static void main(String[] args) {
        // Generate array of 10 random integers between 1 and 100
        int[] randomNumbers = generateRandomNumbers(10, 1, 100);

        // Print all generated numbers
        System.out.println("Generated Numbers:");
        printNumbers(randomNumbers);

        // Find and print max and min
        System.out.println("\nMaximum number: " + findMax(randomNumbers));
        System.out.println("Minimum number: " + findMin(randomNumbers));
    }

    // Generates array of random numbers within specified range
    public static int[] generateRandomNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = rand.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    // Prints all numbers in the array
    public static void printNumbers(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Finds maximum value in array
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Finds minimum value in array
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}