package conditional_thinking;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(digitCount(number));
    }
    private static String digitCount(int number){
        int count = String.valueOf(number).length();
        if(count == 1)
            return "Single-Digit";
        else if(count == 2)
            return "Double-Digit";
        else
            return "Multi-Digit";
    }
}
