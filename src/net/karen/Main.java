package net.karen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Loops */

        String[] questions = new String[3];

        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];

        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        /* For Loop
           i = 0 -> first number
           i < 100 -> the number is smaller than 100
           i++ -> increment 1. Example: 0 < 100 (True) -> 0 + 1 = 1; -> Continue For loop
                                        100 < 100 (False) -> Break For loop
           While FALSE occur the for loop
        */
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        /* For Loop
           questions.length -> array size of questions
           Access arrays with loop
         */
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        // Foreach -> Access each individual value of arrays | question[0], question[1], question[2] ...
        for (String question : questions) {
            System.out.println(question);
        }

        // Scanner and While loop and Endless
        Scanner scanner = new Scanner(System.in);

        /* While TRUE occur the while loop */
        while (true) {
            System.out.println("Do you want continue?");
            if (scanner.next().equals("yes")) {
               continue; // True -> Continue while loop (Endless)
            } else {
               break; // False -> Break while loop
            }
        }
    }
}