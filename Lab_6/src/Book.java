public class Book {
    // Attributes
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book information
    public void printData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[7];

        // Populate the array with sample data
        books[0] = new Book("Book 1", "Author 1");
        books[1] = new Book("Book 2", "Author 2");
        books[2] = new Book("Book 3", "Author 3");
        books[3] = new Book("Book 4", "Author 4");
        books[4] = new Book("Book 5", "Author 5");
        books[5] = new Book("Book 6", "Author 6");
        books[6] = new Book("Book 7", "Author 7");

        // Print out information of each book
        for (Book book : books) {
            book.printData();
            System.out.println();
        }
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }
}
