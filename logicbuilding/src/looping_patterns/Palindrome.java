package looping_patterns;

import java.util.InputMismatchException;

//Q.Check if a number is a palindrome
public class Palindrome {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an Integer: ");
            int number = new java.util.Scanner(System.in).nextInt();
            if (number < 0)
                throw new InputMismatchException("Negative Numbers Are Not Allowed.");
            int reversed = 0, digit , originalNumber = number;
            while(number != 0){
                digit = number%10;
                reversed = reversed*10+digit;
                number /= 10;
            }
            if (reversed == originalNumber)
                System.out.println(originalNumber+" is a palindrome.");
            else
                System.out.println(originalNumber+" is not a palindrome.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
