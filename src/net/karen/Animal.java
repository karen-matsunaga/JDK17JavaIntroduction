package net.karen;

// Super class
// Doesn't exist Animal OBJECT
public abstract class Animal {
    public String picture;
    protected String name;
    protected int age; // Access subclass

    // Default constructor
    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }

    // Abstract METHOD
    public void makeSound() {
        System.out.println(this.name + " just made a Sound!");
    }

    // Left to the subclasses
    // public abstract void makeSound() {}
}
