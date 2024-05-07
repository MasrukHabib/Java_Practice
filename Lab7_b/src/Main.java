//b.	Create a Java program featuring three classes: Shape, Circle, and Rectangle.
// Establish a superclass-subclass relationship, with Shape acting as the superclass and Circle and Rectangle as its subclasses.
// Implement a method named draw() within each class, In the Shape class, define draw() to display "I am parent shape class".
// Define draw() method in Circle and Rectangle class which prints some message.
// Implement the concept of inheritance and overriding.


class Shape {
    void draw() {
        System.out.println("I am parent shape class");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }
}
