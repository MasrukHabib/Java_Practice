public class Rectangle {
    // Attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getters and setters (optional)
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Main method (optional)
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 4.0);

        // Calculate and display area
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        // Calculate and display perimeter
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }
}
