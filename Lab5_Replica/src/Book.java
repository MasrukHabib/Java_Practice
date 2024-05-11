public class Book {
    // Attributes
    private String bookTitle;
    private String author;
    private String publication;

    // Constructor
    public Book(String bookTitle, String author, String publication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publication = publication;
    }

    // Method to display book data
    public void printData() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publication: " + publication);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create Book objects
        Book b1 = new Book("Java Programming", "John Doe", "ABC Publications");
        Book b2 = new Book("Data Structures", "Alice Smith", "XYZ Publishers");

        // Display data for b1 and b2
        System.out.println("Data for b1:");
        b1.printData();
        System.out.println();
        System.out.println("Data for b2:");
        b2.printData();
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }
}
