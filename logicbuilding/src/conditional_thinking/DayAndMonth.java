package conditional_thinking;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

// Take two dates (day and month) and determine which one comes first in the
//calendar
public class DayAndMonth {
    public static void main(String[] args) {
        System.out.println("Enter day and month (DD MM): ");
        String firstInput = new java.util.Scanner(System.in).nextLine().trim();
        String secondInput = new java.util.Scanner(System.in).nextLine().trim();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MM");
        try {
            MonthDay firstDate = MonthDay.parse(firstInput,df);
            MonthDay secondDate = MonthDay.parse(secondInput, df);
            int cmp = firstDate.compareTo(secondDate);
            if(cmp < 0)
                System.out.println(firstInput + " comes before " + secondInput);
            else if(cmp > 0)
                System.out.println(firstInput + " comes after " + secondInput);
            else
                System.out.println("Both dates are the same: " + firstInput);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
