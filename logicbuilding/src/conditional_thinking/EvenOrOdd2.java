package conditional_thinking;

public class EvenOrOdd2 {
    public static void main(String[] args) {
        System.out.println("Enter First Integer: ");
        int firstInt = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter Second Integer: ");
        int secondInt = new java.util.Scanner(System.in).nextInt();
        System.out.println(determineEvenOrOdd(firstInt,secondInt));
    }
    private static String determineEvenOrOdd(int first, int second){
        if(first % 2==0 && second % 2 == 0)
            return "Both numbers are Even.";
        else if(first % 2 !=0 && second % 2 != 0)
            return "Both numbers are odd.";
        else if (first % 2 == 0)
            return first+" is Even and "+second+" is odd.";
        else
            return first+" is odd and "+second+" is Even.";
    }
}
