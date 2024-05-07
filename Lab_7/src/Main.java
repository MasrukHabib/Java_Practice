//a.	Define a Java program comprising three classes: Animal, Dog, and Cat.
// Establish a hierarchical relationship among these classes, with Animal serving as the superclass and Dog and Cat functioning as its subclasses.
// Implement a method named sound() within each class, which displays a message of its sound.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.sound();
        dog.sound();
        cat.sound();
    }
}
