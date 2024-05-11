public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);

        // Calculate and display area
        System.out.println("\n Area of circle: " + circle.calculateArea());

        // Calculate and display circumference
        System.out.println("Circumference of circle: " + circle.calculateCircumference());
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")

    }
}
