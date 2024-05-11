public class Product {
    // Attributes
    private String pro_name;
    private int pro_id;

    // Constructor
    public Product(String pro_name, int pro_id) {
        this.pro_name = pro_name;
        this.pro_id = pro_id;
    }

    // Method to display product information
    public void printData() {
        System.out.println("Product Name: " + pro_name);
        System.out.println("Product ID: " + pro_id);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = new Product[5];

        // Populate the array with sample data
        products[0] = new Product("Product 1", 1001);
        products[1] = new Product("Product 2", 1002);
        products[2] = new Product("Product 3", 1003);
        products[3] = new Product("Product 4", 1004);
        products[4] = new Product("Product 5", 1005);

        // Print out information of each product
        for (Product product : products) {
            product.printData();
            System.out.println();
        }
       System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }
}
