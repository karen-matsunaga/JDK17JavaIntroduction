package net.karen;

public class Question extends Trivia {
    // Default constructor
    public Question(String name) {
        super(name);
    }

    // question custom method
    public static void question(String name) {
        System.out.println(name);
    }
}