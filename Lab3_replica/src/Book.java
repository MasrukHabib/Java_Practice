//Design a Book class with attributes title, author, and numberOfPages.
// Include a method displayBookInfo() to print out the book details.

public class Book {
    // Attributes
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Java Programming", "lena Akter", 300);

        // Display book information
        book.displayBookInfo();
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ");

    }
}
