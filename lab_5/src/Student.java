//a.	Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the data. Create the two objects s1 ,s2 to declare and access the values.


public class Student {
    // Attributes
    private String name;
    private String city;
    private int age;

    // Constructor
    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    // Method to display student data
    public void printData() {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("John", "New York", 20);
        Student s2 = new Student("Alice", "London", 22);

        // Display data for s1 and s2
        System.out.println("Data for s1:");
        s1.printData();
        System.out.println();
        System.out.println("Data for s2:");
        s2.printData();
    }
}
