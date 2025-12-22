package conditional_thinking;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SmallestAngle {
    public static void main(String[] args) {
        System.out.println("Enter Time(H:mm): ");
        String time = new java.util.Scanner(System.in).nextLine().trim();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("H:mm");
        LocalTime currentTime = LocalTime.parse(time,dft);
        System.out.println("Smallest Angle: "+smallestAngle(currentTime));
    }
    private static  double smallestAngle(LocalTime time){
        double minuteAngle  = time.getMinute() * 6;
        double hourAngle = ((time.getHour()%12) * 30 ) + (time.getMinute()*0.5);
        double difference = Math.abs(hourAngle - minuteAngle);
        return Math.min(difference, 360 - difference);
    }
}
