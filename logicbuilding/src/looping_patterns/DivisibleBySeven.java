package looping_patterns;
//Q. print all numbers between a and b divisible by 7
public class DivisibleBySeven {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter b value: ");
        int b = new java.util.Scanner(System.in).nextInt();

        int start = a + (7 - a % 7) % 7;

        for (int i = start; i<=b; i+=7)
                System.out.print(i+" ");

    }
}
