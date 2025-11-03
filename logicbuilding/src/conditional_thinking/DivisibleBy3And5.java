package conditional_thinking;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            while (true){
                try{
                    System.out.println("Enter a Number: ");
                    String number = scan.nextLine();
                    System.out.println(isDivisibleBy3And5(Integer.parseInt(number.trim()))
                    ? "Divisible" : "Not Divisible");
                    break;
                }catch (Exception e){
                    System.out.println("Invalid Input. Please enter an integer.");
                }
            }
        }
    }
    public static boolean isDivisibleBy3And5(int number){
        return number % 3 == 0 && number % 5 == 0;
    }
}
