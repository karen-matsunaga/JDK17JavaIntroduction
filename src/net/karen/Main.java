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
        // System.out.println(bengie.getAge()); - Access Bengie's age

        informationDog(bengie); // Access Bengie's information

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        // System.out.println(gracie.name); - Access Gracie's name
        // System.out.println(gracie.getAge()); - Access Gracie's age

        informationDog(gracie); // Access Gracie's information

        // Accessing custom METHOD woof
        bengie.woof();
        gracie.woof();

        // bengie.getAge() = 10; -> Modifying VALUE of Field DOESN'T WORK in this case!

        /* Modifying dogToHumanYearMultiplier FIELD value
                Dog.dogToHumanYearMultiplier = 10; -> Only static
           OBS: If used final DOESN'T WORK!
           System.out.println(Dog.dogToHumanYearMultiplier); // Access dogToHumanYearMultiplier FIELD
        */
        System.out.println(bengie.getAgeInHumanYears());
    }

    /* My Annotation */
    public static void informationDog(Dog dog) {
        System.out.println("Name: " + dog.name + "\nAge: " + dog.getAge()); // Custom METHOD to print on screen faster
    }
}