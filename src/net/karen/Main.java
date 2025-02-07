package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Casting (or converting data types between each other) */

        int loan = 750;
        float interestRate = 0.0525f;

        /* implicit cast -> 750 transform automatically to float datatype
           explicit cast -> (float) 750 the integer number is forced to transform into float */
        float interest = loan * interestRate; // implicit cast
        System.out.println(interest);

        // Example using float cast
        float interest1 = (float) loan * interestRate; // explicit cast
        System.out.println(interest1);

        // Example using int cast
        /* float = 0.0525f -> int = 0 */
        int interest2 = loan * (int) interestRate; // explicit cast interestRate = int 0
        System.out.println(interest2);
    }
}