public class NumbersPattern {
    public static void main(String[] args) {
        int n = 5; // The maximum number in the pattern

        // Upper half of the pattern (descending)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower half of the pattern (ascending)
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}