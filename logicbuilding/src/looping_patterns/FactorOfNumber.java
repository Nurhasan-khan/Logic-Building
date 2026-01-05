package looping_patterns;
// Q. Print all factors of a given number
public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i<=Math.sqrt(number); i++){
            if (number % i == 0) {
                System.out.print(i + ",");
                if(i != number/i)
                   System.out.print(number / i + ",");
            }
        }
    }
}
