package looping_patterns;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int digit, factorial=1, sumOfFactorial=0, originalNumber = number;
        while(number!=0){
            digit = number%10;
            for(int i = digit; i>=1; i--)
                factorial*=i;
            sumOfFactorial += factorial;
            factorial = 1;
            number /= 10;
        }
        System.out.println(originalNumber == sumOfFactorial ? originalNumber + " is Strong Number"
                : originalNumber + " is not a strong Number");
    }
}
