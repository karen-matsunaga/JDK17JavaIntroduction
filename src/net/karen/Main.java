package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Boolean and Comparison Operators */

        // Boolean
        boolean likesTheLectures = true;
        boolean askedQuestions = false;

        System.out.println("You like these lectures " + likesTheLectures);
        System.out.println("You have asked a Question in the Q&A " + askedQuestions);

        // Comparison Operators
        // Compare two values and return a boolean
        // > >= == != < <=

        // Integer variable
        int yourScore = 98;

        // Bigger or equals (>=)
        boolean passedClass = yourScore >= 50;
        System.out.println("You passed: " + passedClass + " with " + yourScore + " points!");

        // Equals (==)
        boolean hasPerfectScore = yourScore == 100;
        System.out.println(hasPerfectScore);

        // ! (Negate symbol) => 1. true -> false | 2. false -> true
        boolean failedClass = !passedClass;
        System.out.println(failedClass);

    }
}