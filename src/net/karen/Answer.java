package net.karen;

public class Answer extends Trivia {
    // Default constructor
    public Answer(String name) {
        super(name);
    }

    // Correct answer custom method
    public static void correctAnswer(int score) {
        System.out.println("Congratulations! The answer is correct. Your score is: " + "[" + score + " / 5]");
    }

    // Wrong answer custom method
    public static void wrongAnswer(String name, int score) {
        System.out.println("The answer is wrong. " + name + ". Your score is: " + "[" + score + " / 5]");
    }
}