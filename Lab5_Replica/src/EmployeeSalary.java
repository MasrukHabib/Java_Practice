import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter basic salary
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate DA and HRA
        double DA = 0.6 * basicSalary;
        double HRA = 0.25 * basicSalary;

        // Calculate gross salary
        double grossSalary = basicSalary + DA + HRA;

        // Calculate annual salary
        double annualSalary = grossSalary * 12;

        // Determine income tax based on annual salary range
        double incomeTax = 0;
        if (annualSalary >= 300000 && annualSalary < 500000) {
            incomeTax = 0.1 * annualSalary;
        } else if (annualSalary >= 500000 && annualSalary < 1000000) {
            incomeTax = 0.15 * annualSalary;
        } else if (annualSalary >= 1000000) {
            incomeTax = 0.25 * annualSalary;
        }

        // Display gross salary and income tax
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Income Tax: " + incomeTax);

        // Close the scanner
        scanner.close();
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }

}
