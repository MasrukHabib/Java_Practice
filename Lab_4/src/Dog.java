public class Dog {
    // Attributes
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Method to print bark message
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", "Labrador", 3);

        // Make the dog bark
        dog.bark();
       
    }
}
