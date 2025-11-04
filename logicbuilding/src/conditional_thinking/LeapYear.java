package conditional_thinking;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LeapYear {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^\\d{4}$");
        try(Scanner scan = new Scanner(System.in)) {
            while(true) {
                try {
                    System.out.println("Enter a year: ");
                    String year = scan.nextLine();
                    if(pat.matcher(year).matches()) {
                        System.out.println(isLeapYear(Integer.parseInt(year.trim()))
                                ? year + " is a leap year." : year + " is not a leap year.");
                       break;
                    }
                    System.out.println("Invalid input. Please enter a valid year in YYYY format.");
                    continue;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
