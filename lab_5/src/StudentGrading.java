//Develop a Java program to determine the total marks and percentage of a student.
// The program should prompt the user to input marks for 5 subjects using the Scanner class.
// Afterward, it should use if-else statements to categorize the student's performance and display the corresponding grade or division.
import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + " marks: ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate percentage
        double percentage = (double) totalMarks / 5;

        // Determine grade or division based on percentage
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        // Close the scanner
        scanner.close();
    }

}
