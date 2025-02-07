package net.karen;

public class Main {

    // Method main
    public static void main(String[] args) {
        /* Methods */

        String[] que = new String[3];

        que[0] = "How many States does the USA have?";
        que[1] = "What is the Capital of the United Kingdom?";
        que[2] = "What is the chemical symbol for Iron?";

        String[] ans = new String[3];

        ans[0] = "50";
        ans[1] = "London";
        ans[2] = "Fe";

        // Access custom methods on main method

        // 1. outputQuestionsAndAnswers method
        outputQuestionsAndAnswers(que, ans);

        // 2. sum method
        System.out.println(sum(10, 12));
    }

    // 1. Method outputQuestionsAndAnswers -> Method type void
    /*
        public static -> access modifier
        void -> type of method
        outputQuestionsAndAnswers -> name method
        String[] questions, String[] answers -> parameters

        Each method signatures is unique
    */
    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
       for (int i = 0; i < questions.length; i++) {
           System.out.println(questions[i]);
           System.out.println(answers[i]);
       }
    }

    // Error -> Method signatures is UNIQUE
//    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
//    }

    // No error -> Remove String[] answers parameter -> different method signature even if it uses name method equal
    // different 1. number of parameters, 2. types of parameters or 3. return type
//    public static void outputQuestionsAndAnswers(String[] questions) {
//    }

    // 2. Method sum -> Method type int
    public static int sum(int x, int y) {
        return x + y;
    }
}