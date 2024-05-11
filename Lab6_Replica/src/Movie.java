public class Movie {
    // Attributes
    private String title;
    private String genre;
    private int releaseYear;

    // Constructor
    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Method to display movie information
    public void printData() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Create an array of Movie objects
        Movie[] movies = new Movie[3];

        // Populate the array with sample data
        movies[0] = new Movie("Movie 1", "Action", 2020);
        movies[1] = new Movie("Movie 2", "Comedy", 2018);
        movies[2] = new Movie("Movie 3", "Drama", 2019);

        // Print out information of each movie
        for (Movie movie : movies) {
            movie.printData();
            System.out.println();
        }
    System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }
}
