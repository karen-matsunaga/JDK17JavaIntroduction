package net.karen;

// Super Abstract Class
public abstract class Trivia {
    public final String name;

    // Default constructor
    Trivia(String name) {
        this.name = name;
    }

    // Intro Trivia Game custom method
    public static void Intro() {
        System.out.println("--------------");
        System.out.println("GAME TRIVIA #3");
        System.out.println("--------------");
        System.out.print("You ready? ");
    }

    // finalScore custom method
    public static void finalScore(int score) {
        if (score == 5) {
            System.out.println("Congratulations you correct all answers! Your final score is: " + "[" + score + " / 5]");
        }
        else if (score == 4) {
            System.out.println("Very Good! Your final score is: " + "[" + score + " / 5]");
        }

        else if (score == 3) {
            System.out.println("Good! Your final score is: " + "[" + score + " / 5]");
        }

        else if (score == 2) {
            System.out.println("Good luck next time! Your final score is: " + "[" + score + " / 5]");
        }

        else {
            System.out.println("Study more! Your final score is: " + "[" + score + " / 5]");
        }
    }

    // endGame custom method
    public static void endGame() {
        System.out.print("Continue this game? [Yes/No]: ");
    }
}