public class SecondHighestScore {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        if (cgpas.length < 2) {
            System.out.println("Need at least 2 scores to find second highest");
            return;
        }

        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for (double cgpa : cgpas) {
            if (cgpa > highest) {
                secondHighest = highest;
                highest = cgpa;
            } else if (cgpa > secondHighest && cgpa < highest) {
                secondHighest = cgpa;
            }
        }

        System.out.println("Second highest CGPA is: " + secondHighest);

        // Find which student(s) got this score
        System.out.print("Achieved by student(s) at position(s): ");
        for (int i = 0; i < cgpas.length; i++) {
            if (cgpas[i] == secondHighest) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}