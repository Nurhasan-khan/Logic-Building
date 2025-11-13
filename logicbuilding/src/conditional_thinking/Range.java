package conditional_thinking;
//Check if a number lies within the range [100, 999]
public class Range {
    public static void main(String[] args) {
        System.out.println("Enter An Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(isWithInRange(number));
    }
    private static boolean isWithInRange(int number){
        return number >= 100 && number <= 999;
    }
}
