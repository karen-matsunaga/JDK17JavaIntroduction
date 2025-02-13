package net.karen;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /* Interfaces and Abstract */
        /* Adding Dogs with custom CLASS Dog */
        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        /* Adding Cats with custom CLASS Cat */
        Cat whiskers = new Cat("whiskers.png", "Whiskers", 12);

        // Access Dog and Cat classes with custom method of super class Animal
        // Overridden methods called instead of the one by the actual super class
        informationAnimal(whiskers);
        informationAnimal(bengie);
        informationAnimal(gracie);

        // Polymorphism -> Super class Animal
        Animal animal = new Dog("jenny.png", "Jenny", 15);
        animal.makeSound();

        List<Animal> animals = new ArrayList<>();
        animalAddList(animals, bengie);
        animalAddList(animals, gracie);
        animalAddList(animals, whiskers);

        animals.get(1).makeSound(); // Index of animals Super class List

        // Animal is abstract -> Abstract class
        // Cast or Objects never are created on Abstract class!
        // Animal a = new Animal("x.png", "X", 10);

        // Custom Interface
        List<IPettable> pets = new ArrayList<>();
        pets.add(bengie);
        pets.add(whiskers);
        pets.get(1).pet();
    }

    /* My Annotation */
    public static void informationAnimal(Animal animal) {
        animal.makeSound(); // Custom METHOD to print on screen faster
    }

    public static void animalAddList(List<Animal> animals, Animal ani) {
        animals.add(ani); // Custom METHOD to print on screen faster
    }
}