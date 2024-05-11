import java.util.Scanner;

public class lab1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ");
        scanner.close();
    }
}
