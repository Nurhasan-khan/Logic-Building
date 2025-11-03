package conditional_thinking;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (java.util.Scanner scan = new java.util.Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println("Enter a Number: ");
                     String number = scan.nextLine();
                    System.out.println(isEvenOrOdd(Integer.parseInt(number.trim())) ? "Even" : "Odd");
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid Input. Please enter an integer.");
                }
            }
        }
    }
    public static boolean isEvenOrOdd(int number){
        return number % 2 == 0;
    }
}
