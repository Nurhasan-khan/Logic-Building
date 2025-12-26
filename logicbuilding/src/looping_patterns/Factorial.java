package looping_patterns;
//Q.Print the factorial of a given number
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = 0;
        int factorial = 0;
        try {
            number = new java.util.Scanner(System.in).nextInt();
            if(number < 0)
                throw new RuntimeException("Factorial For negative Numbers Are Not Defined");
            factorial = 1;
            for (int i = number; i>=1; i--){
                factorial *= i;
            }
            System.out.println("Factorial Of "+number+" is: "+factorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
