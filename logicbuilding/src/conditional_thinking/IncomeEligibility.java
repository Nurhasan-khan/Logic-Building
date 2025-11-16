package conditional_thinking;

//Take income and age, and check if eligible for tax (age > 18 and income > 5 L)
public class IncomeEligibility {
    public static void main(String[] args) {
        try {
            System.out.println("Enter Your Age: ");
            int age = new java.util.Scanner(System.in).nextInt();
            System.out.println("Enter your Income (in Lakhs): ");
            int income = new java.util.Scanner(System.in).nextInt();
            System.out.println(checkEligibility(age, income));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private static String checkEligibility(int age , int income){
        if (age >= 18 && income >= 500000)
            return "Eligible for Tax";
        else
            return "Not Eligible for Tax";
    }
}
