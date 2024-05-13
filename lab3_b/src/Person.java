public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to greet
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Main method (optional)
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Lena", 20, "Dhaka, Bangladesh");

        // Call the sayHello method
        person.sayHello();
        
    }

}
