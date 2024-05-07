//LAB 8 Replica:
//a.	Create a Java program to simulate a basic vehicle management system. Define an abstract class Vehicle with the following attributes and methods:
//Attributes: model (String), year (integer), price (double)
//Methods: Abstract method calculateTax() to calculate the tax for the vehicle. Method displayInfo() to display information about the vehicle including model, year, price, and calculated tax.
//Implement two concrete subclasses of Vehicle: Car and Motorcycle. Car should have an additional attribute numberOfSeats (integer) and should implement the calculateTax() method to calculate tax based on car's price and number of seats. Motorcycle should have an additional attribute engineCapacity (double) and should implement the calculateTax() method to calculate tax based on motorcycle's engine capacity.
//In the main() method:
//•	Create an object of class Car with model "Toyota Camry", year 2022, price 25000, and number of seats 5.
//•	Create an object of class Motorcycle with model "Honda CB500F", year 2021, price 8000, and engine capacity 500.
//•	Display the information about each vehicle using the displayInfo() method.

abstract class Vehicle {
    String model;
    int year;
    double price;

    abstract double calculateTax();

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Tax: $" + calculateTax());
    }
}

class Car extends Vehicle {
    int numberOfSeats;

    Car(String model, int year, double price, int numberOfSeats) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    double calculateTax() {
        // Assume tax for car is 5% of the price plus $10 for each seat
        return 0.05 * price + 10 * numberOfSeats;
    }
}

class Motorcycle extends Vehicle {
    double engineCapacity;

    Motorcycle(String model, int year, double price, double engineCapacity) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    @Override
    double calculateTax() {
        // Assume tax for motorcycle is $0.002 for each cc of engine capacity
        return 0.002 * engineCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota Camry", 2022, 25000, 5);
        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Honda CB500F", 2021, 8000, 500);

        // Display information about each vehicle
        System.out.println("Car details:");
        car.displayInfo();
        System.out.println();
        System.out.println("Motorcycle details:");
        motorcycle.displayInfo();
    }
}
