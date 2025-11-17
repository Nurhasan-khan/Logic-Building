package conditional_thinking;

//Take a weekday number (1–7) and determine if it is a weekday or weekend.
public class WeekendOrWeekday {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a Day Number (1-7): ");
            int day = new java.util.Scanner(System.in).nextInt();
            System.out.println(getDayType(day));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
    private static String getDayType(int day){
        return switch (day){
            case 1,7 -> "Weekend";
            case 2,3,4,5,6 -> "Weekday";
            default -> "Invalid day number";
        };
    }
}
