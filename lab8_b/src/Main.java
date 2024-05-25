abstract class Employee {
    String name;
    int employeeId;
    double salary;

    abstract double calculateBonus();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    @Override
    double calculateBonus() {
        // Bonus is 10% of the salary for managers
        return 0.1 * salary;
    }
}

class Worker extends Employee {
    private int hoursWorked;

    Worker(String name, int employeeId, double salary, int hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateBonus() {
        // Bonus is $10 for each hour worked beyond 40 hours for workers
        if (hoursWorked > 40) {
            return 10 * (hoursWorked - 40);
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Habib", 101, 5000, "Sales");
        // Create a Worker object
        Worker worker = new Worker("jim", 102, 3000, 45);

        // Display details of each employee
        System.out.println("Manager details:");
        manager.displayDetails();

        System.out.println("\nWorker details:");
        worker.displayDetails();
    }
}
