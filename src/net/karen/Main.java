package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Ternary Operator */

        int exam = 65;
        int gift = 0;

        /* Default code */
        if (exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println(gift);

        /* Ternary Operator - Short code
           exam >= 50 -> condition
           10 -> true
           0 -> false
        */
        gift = exam >= 50 ? 10 : 0;
        System.out.println(gift);
    }
}