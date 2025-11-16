package conditional_thinking;

//Take two numbers and check if both are positive and their sum is less than 100
public class PositiveOrHundred {
    public static void main(String[] args) {
        try {
            System.out.println("Enter Two Numbers: ");
            int num1 = new java.util.Scanner(System.in).nextInt();
            int num2 = new java.util.Scanner(System.in).nextInt();
            System.out.println(checkPositiveAndSum(num1, num2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static String checkPositiveAndSum(int num1 , int num2){
        if(num1>0 && num2>0 && (num1+num2) < 100)
            return "Both numbers are positive and their sum is less than 100";
        else
            return "Condition not met";
    }
}
