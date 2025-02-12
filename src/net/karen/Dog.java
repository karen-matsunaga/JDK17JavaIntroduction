package net.karen;

// Custom class
public class Dog extends Animal {
    public static final int dogToHumanYearMultiplier = 7;

    // Default CONSTRUCTOR Dog Class
    public Dog(String picture, String name, int age) {
        super(picture, name, age); // Animal constructor -> Animal Super class
    }

    public int getAgeInHumanYears() {
        return age * dogToHumanYearMultiplier;
    }

    // Super class Animal -> Overridden Class
    @Override
    public void makeSound() {
        System.out.println(this.name + " just woofed!");
    }
}