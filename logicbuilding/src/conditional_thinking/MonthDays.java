package conditional_thinking;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println("Enter month number (1-12): ");
        int month = new java.util.Scanner(System.in).nextInt();
        String days = daysInMonth(month);
        System.out.println("Number of days: " + days);

    }
    private static String daysInMonth(int month){
        String result;
        switch (month){
            case 2 -> result = "28 Days";
            case 1,3,5,7,8,10,12 -> result = "31 Days";
            case 4,6,9,11 -> result = "30 Days";
            default -> result = "Invalid Month";
        }
        return result;
    }
}
