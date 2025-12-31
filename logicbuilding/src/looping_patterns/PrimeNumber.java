package looping_patterns;
//Q. Check if a number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        boolean isPrime = true;
        for (int i = 2 ; i<=Math.sqrt(number); i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? number+" is a Prime" : number+" is not prime");
    }
}
