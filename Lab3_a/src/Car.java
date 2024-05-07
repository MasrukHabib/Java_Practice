import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter make of the car: ");
        String make = scanner.nextLine();

        System.out.print("Enter model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter year of the car: ");
        int year = scanner.nextInt();

        scanner.nextLine(); // consume newline character

        System.out.print("Enter color of the car: ");
        String color = scanner.nextLine();

        Car car = new Car(make, model, year, color);
        car.displayInfo();

        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");

        scanner.close();
    }
}
