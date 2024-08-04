import java.util.Scanner;

public class lab1_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of the triangle: " + area);
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ");
        scanner.close();
    }
}


