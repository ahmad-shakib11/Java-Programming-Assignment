public class FindQuesMarks {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        // Calculate possible combinations
        findQuestionCombination(totalQuestions, totalMarks);
    }

    public static void findQuestionCombination(int totalQuestions, int totalMarks) {
        boolean found = false;

        // Loop through possible numbers of 10-mark questions
        for (int x = 0; x <= totalQuestions; x++) {
            int y = totalQuestions - x; // 5-mark questions

            if (10 * x + 5 * y == totalMarks) {
                System.out.println("5 marks question is " + y);
                System.out.println("10 marks question is " + x);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No valid combination found");
        }
    }
}