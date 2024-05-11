import java.util.Scanner;

public class lab2_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        System.out.println("\n name: \n Enrollment: 92301703076 \n Section: \n lab-batch: ");
        scanner.close();
    }
}
