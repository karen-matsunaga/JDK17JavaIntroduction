package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Boolean and Logical Operators */

        boolean watchedLectures = true;
        boolean askedQuestion = false;
        boolean finishedAssignments = true;
        boolean gaveReview = false;

        // Logical Operators
        /* && (AND) ALL values true/false return TRUE/FALSE, one value false return FALSE;
        || (OR) one value or ALL values true return TRUE, but ALL values false return FALSE;
        ! (NOT) INVERTED value -> 1. true > false | 2. false > true.
         */

        boolean finishedCourse = watchedLectures && finishedAssignments;
        boolean isFan = finishedCourse && gaveReview;
        boolean learning = watchedLectures || askedQuestion;

        System.out.println(finishedCourse);
        System.out.println(isFan);
        System.out.println(learning);
    }
}