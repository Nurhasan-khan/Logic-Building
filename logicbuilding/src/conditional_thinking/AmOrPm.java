package conditional_thinking;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//Take 24-hour time (hours and minutes) and print whether it is AM or PM
public class AmOrPm {
    public static void main(String[] args) {
        System.out.println("Enter the current hour(HH:mm) (0-23): ");
        String date = new java.util.Scanner(System.in).nextLine().trim();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("H:mm");
        try {
            LocalTime currentTime = LocalTime.parse(date, dft);
            int hour = currentTime.getHour();
            System.out.print("Current hour: " + hour + " ");
        }catch (DateTimeException e){
            System.out.println(e.getMessage() + "\n Invalid time format.");
        }
    }
    private static String getAmOrPm(int hour){
        if(hour >= 0 && hour < 12)
            return "AM";
        else if (hour >= 12 && hour <= 23)
            return "PM";
        else
            return "Invalid hour";

    }
}
