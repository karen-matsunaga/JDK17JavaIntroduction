package net.karen;

// Custom class
public class Dog {
    // Adding some FIELDS / ATTRIBUTES
    public String picture;
    protected String name;
    private int age;
    public static final int dogToHumanYearMultiplier = 7;

    /* 1. Access Modifiers
       public -> does changeable value normally
       protected -> Same package
       private -> Access only in the same class | Doesn't access directly | does changeable value

       1.1 Sort Access Modifiers -> Fields or Methods
       static -> DOES changeable, called on the class and DOESN'T require specific object to be created
       final -> DOESN'T changeable value FIELD
    */

    // Getter -> return private field
    public int getAge() {
        return age;
    }

    // Default constructor
    public Dog() {}

    // Private changed value -> custom Method
    public void birthday() {
        age++;
    }

    // Type field and static field -> custom Method
    public int getAgeInHumanYears() {
        return age * dogToHumanYearMultiplier;
    }

    // Custom CLASS with Default constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    // Custom METHOD
    public void woof() {
        System.out.println(this.name + " just woofed!");
    }
}