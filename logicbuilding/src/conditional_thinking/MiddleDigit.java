package conditional_thinking;

public class MiddleDigit {
    public static void main(String[] args) {
        System.out.println("Enter Three Digit Number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(getMiddleDigit(number));
    }
    private static String getMiddleDigit(int number){
        int mid = (number % 100) / 10;
        if((number/100) < mid &&  (number%100)%10 < mid )
              return "Middle digit is Larger";
        else
            return "Middle Digit is smaller.";
    }
}
