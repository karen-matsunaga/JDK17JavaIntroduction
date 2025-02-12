package net.karen;

public class Main {
    public static void main(String[] args) {
    /* Classes and Objects */

        /* Used DEFAULT constructor */
        Dog doggo = new Dog(); // Remember SCANNER class -> DOG class
        System.out.println(doggo.name); // Return NULL because not added VALUES on FIELDS

        /* Adding Dogs with custom CLASS Dog */
        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        // System.out.println(bengie.name); - Access Bengie's name
        // System.out.println(bengie.age); - Access Bengie's age

        informationDog(bengie); // Access Bengie's information

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        // System.out.println(gracie.name); - Access Gracie's name
        // System.out.println(gracie.age); - Access Gracie's age

        informationDog(gracie); // Access Gracie's information

        // Accessing custom METHOD woof
        bengie.woof();
        gracie.woof();

        // Modifying VALUE of Field
        bengie.age = 10;
        System.out.println("New value Bengie's age: " + bengie.age); // Return new VALUE of Field
    }

    /* My Annotation */
    public static void informationDog(Dog dog) {
        System.out.println("Name: " + dog.name + "\nAge: " + dog.age); // Custom METHOD to print on screen faster
    }
}