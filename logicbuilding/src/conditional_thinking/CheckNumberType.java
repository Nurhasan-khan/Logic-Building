package conditional_thinking;

import java.util.Scanner;

public class CheckNumberType {
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("Enter a number: ");
                String result = checkNumberType(new Scanner(System.in).nextInt());
                System.out.println(result);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
    public static String checkNumberType(int number){
        if(number > 0)
            return "Positive";
        else if (number < 0)
            return "Negative";
        else
            return "Zero";

    }
}
