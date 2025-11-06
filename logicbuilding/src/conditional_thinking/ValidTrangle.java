package conditional_thinking;

public class ValidTrangle {
    public static void main(String[] args) {
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(isValidTriangle(a,b,c) ? "Valid Triangle" : "Invalid Triangle");
    }
    protected static boolean isValidTriangle(int a, int b, int c){
        return (a+b>c) && (a+c>b) && (b+c>a);
    }
}
