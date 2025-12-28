package looping_patterns;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a Digit: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int product = 1 , digit, temp = number;
        while(number > 0){
            digit = number%10;
            product *= digit;
            number = number/10;
        }
        System.out.println("Product Of "+temp+" Is: "+product);

    }
}
