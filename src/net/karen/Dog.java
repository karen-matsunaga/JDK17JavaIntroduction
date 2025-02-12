package net.karen;

// Custom class
public class Dog {
    // Adding some FIELDS / ATTRIBUTES
    public String picture;
    public String name;
    public int age;

    // Default constructor
    public Dog() {}

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