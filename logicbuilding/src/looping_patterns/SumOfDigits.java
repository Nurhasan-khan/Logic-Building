package looping_patterns;
//Q. Find the sum of digits of a number.
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int sum=0 , digit , originalNumber = number;
        while (number != 0){
            digit = number%10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of "+originalNumber+" is "+sum);
    }
}
