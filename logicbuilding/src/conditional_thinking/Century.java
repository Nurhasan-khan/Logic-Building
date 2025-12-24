package conditional_thinking;

import java.time.Year;

public class Century {
    public static void main(String[] args) {
        System.out.println("Enter The year: ");
        int year = new java.util.Scanner(System.in).nextInt();
        Year year1 = Year.of(year);
        int century = (year1.getValue()-1)/ 100 +1;
        System.out.println(century+ getSuffix(century)+" Century");

    }
    static String getSuffix(int c){
       return switch(c%10){
           case 1 -> "st";
           case 2 -> "nd";
           case 3 -> "rd";
           default -> "th";
        };
    }
}
