import java.util.Scanner;

public class Employee {
    // Attributes
    private String Emp_name;
    private int Emp_code;
    private double Emp_sal;

    // Method to accept data of an employee
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        Emp_name = scanner.nextLine();
        System.out.print("Enter Employee Code: ");
        Emp_code = scanner.nextInt();
        System.out.print("Enter Employee Salary: ");
        Emp_sal = scanner.nextDouble();
        scanner.close();
    }

    // Method to display employee information
    public void printData() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee Code: " + Emp_code);
        System.out.println("Employee Salary: " + Emp_sal);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create Employee objects
        Employee E1 = new Employee();
        Employee E2 = new Employee();

        // Accept and display data of E1
        System.out.println("Enter data for Employee E1:");
        E1.getData();
        System.out.println("Data for Employee E1:");
        E1.printData();

        // Accept and display data of E2
        System.out.println("\nEnter data for Employee E2:");
        E2.getData();
        System.out.println("Data for Employee E2:");
        E2.printData();
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }
}
