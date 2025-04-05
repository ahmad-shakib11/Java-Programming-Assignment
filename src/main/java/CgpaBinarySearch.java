import java.util.Scanner;

public class CgpaBinarySearch {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        // Sort the array first (binary search requires sorted array)
        selectionSortAscending(cgpas);

        System.out.println("Sorted CGPA Scores (for binary search):");
        printArray(cgpas);

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a CGPA to search: ");
        double searchCgpa = scanner.nextDouble();
        scanner.close();

        // Perform binary search
        int result = binarySearch(cgpas, searchCgpa);

        // Display result
        if (result == -1) {
            System.out.println(searchCgpa + " not found in the CGPA list.");
        } else {
            System.out.println(searchCgpa + " found at position " + (result + 1) + " in the sorted list.");
        }
    }

    // Binary search implementation
    public static int binarySearch(double[] arr, double key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Key was not present
        return -1;
    }

    // Selection sort in ascending order
    public static void selectionSortAscending(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Helper method to print the array
    public static void printArray(double[] arr) {
        for (double score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}