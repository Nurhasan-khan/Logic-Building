package conditional_thinking;

import java.util.InputMismatchException;

// Take an integer (1–9999) and check if the sum of its digits is greater than the product
//of its digits
public class SumAndProduct {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an integer (1-9999): ");
            int num = new java.util.Scanner(System.in).nextInt();
            if( num < 1 || num > 9999)
                throw new InputMismatchException("Number must be between 1 and 9999");
            System.out.println(
                    sum(num) > product(num) ?
                            "Sum Of Digits Is Greater Than Product Of Digits":
                            "Product Of Digits Is Greater Than Or Equal To Sum Of Digits"
            );
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    private static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    private static int product(int num){
        int product = 1;
        while(num > 0){
            product *= num%10;
            num /= 10;
        }
        return product;
    }
}
