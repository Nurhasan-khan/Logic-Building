package conditional_thinking;

//Take day and month and check if it forms a valid calendar date (ignoring leap years)
public class ValidCalendar {
    public static void main(String[] args) {
        System.out.println("Enter day and Month: ");
        int day = new java.util.Scanner(System.in).nextInt();
        int month = new java.util.Scanner(System.in).nextInt();
        System.out.println(isValidDate(day, month) ? "Valid Date" : "Invalid Date");
    }
    private static boolean isValidDate(int day , int month){
        if(month < 1 || month > 12)
            return false;
        if(day < 1 ) return false;
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        return day <= daysInMonth[month-1];
    }
}
