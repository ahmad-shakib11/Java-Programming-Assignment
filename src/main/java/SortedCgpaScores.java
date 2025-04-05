public class SortedCgpaScores {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        System.out.println("Original CGPA Scores:");
        printArray(cgpas);

        // Sort in descending order using selection sort
        selectionSortDescending(cgpas);

        System.out.println("\nSorted CGPA Scores (Highest to Lowest):");
        printArray(cgpas);
    }

    // Selection sort implementation for descending order
    public static void selectionSortDescending(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // Find the maximum element in remaining unsorted array
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element
            double temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
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
