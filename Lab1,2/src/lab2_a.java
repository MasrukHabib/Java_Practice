import java.util.Scanner;

public class lab2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd natural numbers up to " + n + " is: " + sum);
        System.out.println("\n name: \n Enrollment:  \n Section:2EC1 \n lab-batch: ");
        scanner.close();
    }
}
