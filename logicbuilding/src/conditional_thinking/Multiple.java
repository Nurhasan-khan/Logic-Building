package conditional_thinking;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(findMultiple(a,b));
    }
    private static String findMultiple(int a , int b){
        if(a % b == 0)
            return a+" is a multiple of "+b;
        else if(b % a == 0)
            return b+" is a multiple of "+a;
        else
            return "Neither number is a multiple of the other";
    }
}
