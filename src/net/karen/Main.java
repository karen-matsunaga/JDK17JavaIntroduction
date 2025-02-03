package net.karen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* If and Else Statements */

        // Integers variables
        int exam1 = 65;
        int exam2 = 51;

        // Read two variables
        Scanner scanner = new Scanner(System.in);

        // Exam1's variable
        System.out.println("Results for Exam 1: ");
        exam1 = scanner.nextInt();

        // Exam2's variable
        System.out.println("Results for Exam 2: ");
        exam2 = scanner.nextInt();

        // Exam1 statement
        if (exam1 >= 50) {
            System.out.println("You have PASSED Exam 1");
        } else {
            System.out.println("You have FAILED Exam 1");
        }

        // Exam2 statement
        if (exam2 >= 50) {
            System.out.println("You have PASSED Exam 2");
        } else {
            System.out.println("You have FAILED Exam 2");
        }

        // Exam1 and Exam2 statement
        if (exam1 >= 50 && exam2 >= 50) {
            System.out.println("You have PASSED the Class");
        }
    }
}