package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Assignment Operators */

        // Variables
        int x = 100, y = 20; // Integers variables

        // Assignment Operator

        // Addition
        x = x + y; // Long version - 100 + 20 = 120
        x += y;    // Sort version - 120 + 20 = 140
        System.out.println(x);

        // Subtraction
        x -= y; // 140 - 20
        System.out.println(x);

        // Multiplication
        x *= y; // 120 * 20 = 2400
        System.out.println(x);

        // Division
        x /= y; // 2400 / 20 = 120
        System.out.println(x);

        // Remainder or modulo
        x %= y; // 120 % 20 = 0
        System.out.println(x);

        // Incrementing
        // Plus
        x = x + 1; // Long version  - 0 + 1 = 1
        x += 1;    // Short version - 1 + 1 = 2
        x++;       // Shortest version
        System.out.println(x); // 2 + 1 = 3

        // Decrementing
        // Minus
        x--; // Shortest version
        System.out.println(x); // 3 - 1 = 2
    }
}