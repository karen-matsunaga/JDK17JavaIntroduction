package net.karen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] que = new String[5];
        que[0] = "Neymar is known in which sport?";
        que[1] = "Lewis Hamilton was champion how many times in Formula 1?";
        que[2] = "What is the capital of Japan?";
        que[3] = "Who created the Java programming language?";
        que[4] = "What does the acronym WWW mean?";

        String[] ans = new String[5];
        ans[0] = "Football";
        ans[1] = "7";
        ans[2] = "Tokyo";
        ans[3] = "SunMicrosystems";
        ans[4] = "WorldWideWeb";

       // Game Trivia menu
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Play Trivia Game #2? ");
           int score = 0;
           if (scanner.next().equals("yes")) {
               for (int i = 0; i < que.length; i++) {
                   showQuestions(que, i);
                   String answer = scanner.next();
                   if (answer.equals(ans[i])) {
                       score++;
                       checkAnswer(ans, i, answer, score);
                   } else {
                       checkAnswer(ans, i, answer, score);
                   }
               }
           } else {
               break;
           }
       }
    }

    // First method - Questions
    public static void showQuestions(String[] question, int i) {
        System.out.println(i+1 + "- " + question[i]);
    }

    // Second method - Answers
    public static void checkAnswer(String[] answer, int i, String typeAnswer, int score) {
        if (typeAnswer.equals(answer[i])) {
            System.out.println("Congratulations the answer is correct! Your Score is: [" + score + "/" + 5 + "]");
        }
        else {
            System.out.println("The answer is wrong! " + answer[i] + ". Your Score is : [" + score + "/" + 5 + "]");
        }
    }
}