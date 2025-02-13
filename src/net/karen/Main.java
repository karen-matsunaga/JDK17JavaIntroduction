package net.karen;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Questions
        Trivia que1 = new Question("Neymar is known in which sport?");
        Trivia que2 = new Question("Lewis Hamilton was champion how many times in Formula 1?");
        Trivia que3 = new Question("What is the capital of Japan?");
        Trivia que4 = new Question("Who created the Java programming language?");
        Trivia que5 = new Question("What does the acronym WWW mean?");

        List<Trivia> que = new ArrayList<>();
        que.add(0, que1);
        que.add(1, que2);
        que.add(2, que3);
        que.add(3, que4);
        que.add(4, que5);

        // Answers
        Trivia ans1 = new Answer("Football");
        Trivia ans2 = new Answer( "7");
        Trivia ans3 = new Answer( "Tokyo");
        Trivia ans4 = new Answer( "SunMicrosystems");
        Trivia ans5 = new Answer( "WorldWideWeb");

        List<Trivia> answer = new ArrayList<>();
        answer.add(0, ans1);
        answer.add(1, ans2);
        answer.add(2, ans3);
        answer.add(3, ans4);
        answer.add(4, ans5);

        Scanner scanner = new Scanner(System.in);
        Trivia.Intro();

        // Questions and Answers
        while (true) {
            int score = 0;
            String type = scanner.next();
            if (type.equals("yes")) {
                for (int i = 0; i < que.toArray().length; i++) {
                    Question.question(que.get(i).name);
                    String typeA = scanner.next();
                    if (typeA.equals(answer.get(i).name)) {
                        score++;
                        Answer.correctAnswer(score);
                    } else {
                        Answer.wrongAnswer(answer.get(i).name, score);
                    }
                }
            }
            else {
                break; // Break loop -> False
            }
            // Final Score and Continue game
            Trivia.finalScore(score);
            Trivia.endGame();
        }
    }
}