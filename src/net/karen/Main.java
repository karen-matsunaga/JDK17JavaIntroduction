package net.karen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        String question1, question2, question3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. How is declared integer on Java? ");
        question1 = scanner.next();

        if (question1.equals("int")) {
            System.out.println("Congratulations the answer is correct!");
            score += 1;
        } else {
            System.out.println("The correct answer is int");
        }

        System.out.println("2. Logical Operator represents bigger on Java?");
        question2 = scanner.next();

        if (question2.equals(">")) {
            System.out.println("Congratulations the answer is correct!");
            score += 1;
        } else {
            System.out.println("The correct answer is >");
        }

        System.out.println("3. What is method that represent PI?");
        question3 = scanner.next();

        if (question3.equals("3.14")) {
            System.out.println("Congratulations the answer is correct!");
            score += 1;
        } else {
            System.out.println("The correct answer is 3.14");
        }

        System.out.println("Your score is " + "[" + score + " / 3]");
    }
}