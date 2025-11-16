package conditional_thinking;

//Take a single digit (0–9) and print its word form (“Zero” to “Nine”)
public class NumbersToWord {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a Number (0-9): ");
            int number = new java.util.Scanner(System.in).nextInt();
            System.out.println(convertNumberToWord(number));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String convertNumberToWord(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid input! Please enter a number between 0 and 9.";
        };
    }
}