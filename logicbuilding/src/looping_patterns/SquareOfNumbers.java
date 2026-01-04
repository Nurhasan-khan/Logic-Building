package looping_patterns;
//Q. Print the squares of numbers from 1 to n
public class SquareOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter n value: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(i +"^2"+" = "+i*i);
        }
    }
}
