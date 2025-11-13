package conditional_thinking;
// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes
public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter Amount: ");
        int amount = new java.util.Scanner(System.in).nextInt();
        System.out.println(isEvenlyDivided(amount) ? "Valid Amount" : "Invalid");

    }
    private static boolean isEvenlyDivided(int currency){
        return currency % 100 == 0;
    }
}
