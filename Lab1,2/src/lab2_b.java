import java.util.Scanner;

public class lab2_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Area of rectangle is: " + area);
        System.out.println("\n name: \n Enrollment: \n Section: \n lab-batch: ");
        scanner.close();
    }
}
