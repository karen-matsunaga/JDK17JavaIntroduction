package net.karen;

public class Cat extends Animal implements IPettable {
    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }

    // Super class Animal -> Overridden Class
    @Override
    public void makeSound() {
        System.out.println(this.name + " just meowed!");
    }

    // Custom Interface Pet method
    @Override
    public void pet() {
        System.out.println(this.name + " was pet!");
    }
}
