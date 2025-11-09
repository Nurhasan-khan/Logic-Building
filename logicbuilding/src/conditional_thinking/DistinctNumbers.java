package conditional_thinking;

public class DistinctNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Three Digit Number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(isDistinct(number) ? "Distinct" : "Not Distinct");

    }
    private static boolean isDistinct(int number){
       int first = number/100;
       int second = (number/10)%10;
       int third = number%10;
       return first!=second && first!=third && second != third;
    }
}
