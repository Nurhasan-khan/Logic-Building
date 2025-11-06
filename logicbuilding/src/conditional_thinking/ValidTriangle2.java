package conditional_thinking;

public class ValidTriangle2 {
    public static void main(String[] args) {
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
       if(ValidTrangle.isValidTriangle(a,b,c)){
           if(b == c && a == c)
               System.out.println("Equilateral Triangle");
           else if(a==b || b==c || a==c)
               System.out.println("Isosceles Triangle");
           else System.out.println("Scalene Triangle");
       }
    }
}
