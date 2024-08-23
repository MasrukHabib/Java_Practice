abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void display() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 3);
        // Create a Circle object
        Circle circle = new Circle(4);

        // Display information about each shape
        rectangle.display();
        circle.display();

        // Calculate and display the area of each shape
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("\n name:Lena Akter \n Enrollment: \n Section:2EC1 \n lab-batch: C");
    }
}
