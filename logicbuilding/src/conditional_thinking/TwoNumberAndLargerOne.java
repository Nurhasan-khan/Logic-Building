package conditional_thinking;

import java.util.Scanner;

public class TwoNumberAndLargerOne {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter First Number: ");
                    var firstInput = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    var secondInput = scan.nextInt();
                    System.out.println(isLarger(firstInput,secondInput) ? firstInput
                            + " is Larger. " : secondInput+" is Larger.");
                    break;
                }catch (Exception e){
                    System.out.println("Invalid Input. Please enter an integer.");
                    scan.nextLine(); // clear the invalid input
                }
            }
        }
    }
    private static boolean isLarger(int first , int second){
        return first > second;
    }
}
