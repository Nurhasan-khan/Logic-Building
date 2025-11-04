package conditional_thinking;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)){
            while(true){
                try{
                    System.out.println("Enter First Number: ");
                    var firstInput = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    var secondInput = scan.nextInt();
                    System.out.println("Enter Third Number: ");
                    var thirdInput = scan.nextInt();
                    int max = Math.max(firstInput,Math.max(secondInput,thirdInput));
                    int count = (firstInput == max ? 1 : 0) + (secondInput==max ? 1 : 0)
                            + (thirdInput==max ? 1 : 0);
                    if(count>1){
                        System.out.println("There is no largest number as the largest number is repeated.");
                    } else if (firstInput == max)
                        System.out.println("First Number is the largest: " + firstInput);
                    else if (secondInput == max)
                        System.out.println("Second Number is the largest: " + secondInput);
                    else
                        System.out.println("Third Number is the largest: " + thirdInput);
                    break;
                }catch (Exception e){
                    System.out.println("Invalid Input. Please enter an integer.");
                    scan.nextLine(); // clear the invalid input
                }
            }
        }
    }
}
