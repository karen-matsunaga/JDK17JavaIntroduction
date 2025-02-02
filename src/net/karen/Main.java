package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Integers, Math and Arithmetic Operators */

        // Variables
        int x = 100, y = 20, result; // Integers variables

        // Addition
        result = x + y;
        System.out.println(result);

        // Subtraction
        result = x - y;
        System.out.println(result);

        // Multiplication
        result = x * y;
        System.out.println(result);

        // Division
        result = x / y;
        System.out.println(result);

        // Remainder or modulo
        result = 20 % 2;
        System.out.println(result);

        // Math methods -> Particular function
        System.out.println(Math.max(x, y)); // Max method Ex: Interval between x (100) and y (20) = 100
        System.out.println(Math.abs(-500)); // Absolute method Ex: |-500| = 500
    }
}