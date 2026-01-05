package looping_patterns;
// Q. Find LCM of two numbers using loops
public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter first Number: ");
        int firstNumber = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter second Number: ");
        int secondNumber = new java.util.Scanner(System.in).nextInt();
        int temp , fN = firstNumber , sN = secondNumber, hcf;
        while(secondNumber != 0) {
            temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        hcf = firstNumber;
        int multiplierOfFirstNumber = fN / hcf;
        int multiplierOfSecondNumber = sN / hcf;
        int lcm = hcf * multiplierOfFirstNumber * multiplierOfSecondNumber;
        System.out.println("LCM of "+fN+" and "+sN+" is: "+lcm);
    }
}
