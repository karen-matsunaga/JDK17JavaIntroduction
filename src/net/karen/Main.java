package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Arrays */

        /* Question and Answer with String variable */

        String question1 = "How many States does the USA have?";
        String question2 = "What is the Capital of the United Kingdom?";
        String question3 = "What is the chemical symbol for Iron?";

        String answer1 = "50";
        String answer2 = "London";
        String answer3 = "Fe";

        System.out.println(question1);
        System.out.println(answer1);

        System.out.println(question2);
        System.out.println(answer2);

        System.out.println(question3);
        System.out.println(answer3);

        /* Questions and Answers using Array */
        String[] questions = new String[3];

        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];

        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        System.out.println(questions[1]);
        System.out.println(answers[1]);

        questions[0] = "How old is Ewan McGregor (in 2021)?";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        /* Array with length method */
        System.out.println(questions.length);

        // ArrayIndexOutOfBoundsException (Uncomment line below) -> Index questions[3] not exist
        // System.out.println(questions[3]);
    }
}