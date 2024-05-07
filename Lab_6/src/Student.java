public class Student {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Populate the array with sample data
        students[0] = new Student("Lena", 20);
        students[1] = new Student("Akter", 22);
        students[2] = new Student("Jim", 21);

        // Print out information of each student
        for (Student student : students) {
            student.printData();
            System.out.println();
        }

        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }
}
