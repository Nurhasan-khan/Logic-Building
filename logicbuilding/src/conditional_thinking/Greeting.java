package conditional_thinking;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter the current hour(HH:mm:ss) (0-23): ");
        String date = new java.util.Scanner(System.in).nextLine();
        LocalTime currentTime = LocalTime.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss");
        formatter.format(currentTime);
        int hour = currentTime.getHour();
        System.out.println("Current hour: "+hour);
        System.out.println(getGreeting(hour));

    }
    private static String getGreeting(int hour){
        if(hour >= 0 && hour < 12)
            return "Good Morning";
        else if (hour >= 12 && hour < 17)
            return "Good Afternoon";
        else if(hour >= 17 && hour < 21)
            return "Good Evening";
        else
            return "Good Night";

    }
}
