package looping_patterns;
//Q.Print the sum of first n natural numbers
public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the nth: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of n Natural Number: "+sum);
    }
}
