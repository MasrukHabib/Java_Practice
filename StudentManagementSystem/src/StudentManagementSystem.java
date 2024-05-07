import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nName:Lena Akter, Enorllment:92301703076");
            System.out.println("\n\t Welcome!");
            System.out.println("\nStudent Management System");
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
                choice = -1;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println("ID: " + student.id + ", Name: " + student.name);
            }
        }
    }

    public static void updateStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found to update!");
        } else {
            System.out.print("Enter the ID of the student to update: ");
            int id = scanner.nextInt();
            int index = findStudentIndex(id);
            if (index != -1) {
                scanner.nextLine();
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                students.get(index).name = name;
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student with ID " + id + " not found!");
            }
        }
    }

    public static void deleteStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found to delete!");
        } else {
            System.out.print("Enter the ID of the student to delete: ");
            int id = scanner.nextInt();
            int index = findStudentIndex(id);
            if (index != -1) {
                students.remove(index);
                System.out.println("\nStudent deleted successfully!");
            } else {
                System.out.println("Student with ID " + id + " not found!");
            }
        }
    }

    public static int findStudentIndex(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }
}