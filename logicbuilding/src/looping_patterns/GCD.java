package looping_patterns;
//Q. Find HCF (GCD) of two numbers using loops
public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter first Number: ");
        int firstNumber = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter second Number: ");
        int secondNumber = new java.util.Scanner(System.in).nextInt();
        int temp;
        while(secondNumber != 0){
            temp = secondNumber;
            secondNumber = firstNumber%secondNumber;
            firstNumber = temp;
        }
        System.out.println("GCD is: "+firstNumber);
    }
}
