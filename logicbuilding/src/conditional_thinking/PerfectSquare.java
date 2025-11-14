package conditional_thinking;
//Check whether a number is a perfect square (without using the square root function)
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(isPerfectSquare(number));
    }
    private static String isPerfectSquare(int number){
        if(number < 0)
            return "Negative numbers cannot be perfect squares";
        for(int i = 0; i*i <= number; i++){
            if(i*i == number)
                return "Perfect Square of "+i;
        }
        return "Not a Perfect Square";
    }
}
