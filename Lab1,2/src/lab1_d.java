import java.util.Scanner;

public class lab1_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int dayNum = scanner.nextInt();

        String day;
        switch (dayNum) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
        }

        System.out.println("Corresponding day of the week: " + day);
        System.out.println("\n name: \n Enrollment:  \n Section:2EC1 \n lab-batch: ");
        scanner.close();
    }
}
