package conditional_thinking;

import java.util.InputMismatchException;

//  Take a 3-digit number and check if the sum of the first and last digit equals the middle
//digit.
public class SumOfFirstAndLast {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a Three-Digit Number: ");
            int number = new java.util.Scanner(System.in).nextInt();
            if (number < 100 || number > 999)
                throw new InputMismatchException("Please enter a valid three-digit number.");
            int middleDigit = (number % 100) / 10;
            System.out.println(sumOfFirstAndLast(number) == middleDigit ?
                    "The Sum is Equal to the middle digit." :
                    "The Sum is Not Equal to the middle digit.");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }
    private static int sumOfFirstAndLast(int number){
        int firstDigit = number / 100;
        int lastDigit = (number % 100) % 10;
        return firstDigit + lastDigit;
    }
}
