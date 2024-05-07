import java.util.Scanner;
import java.util.Random;

class InvalidSizeException extends Exception {
    public InvalidSizeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            try {
                System.out.print("Enter the size of the array (positive integer): ");
                size = scanner.nextInt();
                if (size <= 0) {
                    throw new InvalidSizeException("Size must be a positive integer.");
                }
            } catch (InvalidSizeException e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // Consume the remaining newline character
                size = -1; // Set size to -1 to force the loop to continue
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.nextLine(); // Consume the remaining newline character
                size = -1; // Set size to -1 to force the loop to continue
            }
        } while (size <= 0);

        int[] array = new int[size];
        fillArrayWithRandomNumbers(array);
        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Random number between 1 and 100
        }
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }

}
