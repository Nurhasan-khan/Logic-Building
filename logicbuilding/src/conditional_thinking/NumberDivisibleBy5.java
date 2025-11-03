package conditional_thinking;

import java.util.Scanner;

public class NumberDivisibleBy5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter a Number: ");
                    String number = scan.nextLine();
                    System.out.println(isDivisibleBy5(Integer.parseInt(number.trim()))
                    ? "Divisible by 5" : "Not Divisible By 5");
                    break;
                }catch (Exception e){
                    System.out.println("Invalid Input. Please enter an integer.");
                }
            }
        }
    }
    public static boolean isDivisibleBy5(int number){
        return number % 5 == 0;
    }
}
