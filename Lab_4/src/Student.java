public class Student {
    // Attributes
    private String name;
    private int age;
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Lena", 20, 10);

        // Display student information
        student.displayStudentInfo();
  
    }
}
