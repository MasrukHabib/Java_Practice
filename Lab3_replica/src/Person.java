public class Person {
    // Attributes
    private String name;
    private String gender;
    private int age;

    // Constructor
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Method to check if the person is adult
    public boolean isAdult() {
        return age >= 18;
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Lena ", "female", 20);

        // Check if the person is an adult
        if (person.isAdult()) {
            System.out.println(person.getName() + " is an adult.");
        } else {
            System.out.println(person.getName() + " is not an adult.");
        }
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");

    }

    // Getters (optional)
    public String getName() {
        return name;
    }
}
