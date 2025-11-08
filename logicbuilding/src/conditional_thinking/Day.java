package conditional_thinking;

public class Day {
    public static void main(String[] args) {
        System.out.println("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = new java.util.Scanner(System.in).nextInt();
        System.out.println(getDayOfWeek(dayNumber));
    }
    private static String getDayOfWeek(int dayNumber){
       return switch (String.valueOf(dayNumber)) {
            case "1" -> "Monday";
            case "2" -> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "Invalid input! Please enter a number between 1 and 7.";
        };
    }
}
