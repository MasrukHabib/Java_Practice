// Main.java
import datetime.DateTimeUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current Date: " + DateTimeUtils.getCurrentDate());

        Date currentDate = new Date();
        System.out.println("Formatted Date: " + DateTimeUtils.formatCustomDate(currentDate, "dd/MM/yyyy"));
        System.out.println("\n name:Lena Akter \n Enrollment: 92301703076 \n Section:2EC1 \n lab-batch: C");
    }
}
