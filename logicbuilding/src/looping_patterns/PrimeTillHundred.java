package looping_patterns;
//Q.Print all prime numbers between 1 and 100
public class PrimeTillHundred {
    public static void main(String[] args) {
        System.out.println("Prime Numbers Between 1 And 100 Are: ");
        for (int i = 2; i<=100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i+" ");
        }
    }
}
