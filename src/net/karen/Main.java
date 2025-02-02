package net.karen;

import java.util.Scanner; // Library of read value of variable

public class Main {
    public static void main(String[] args) {
        /* Outputting with println and Inputting with Scanner */

        /* Output a phrase */
        System.out.println("Hello World!");
        System.out.println("Hello Students!");

        // Declared and output a variable with phrase
        int x = 10;
        System.out.println(x);
        System.out.println("Outputting some Value: " + x);

        // Read a value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username: ");
        String input = scanner.next();
        System.out.println("Your Username is: " + input);
    }
}