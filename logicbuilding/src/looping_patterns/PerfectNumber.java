package looping_patterns;
//Q. Check if a number is a perfect number

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int sumOfDivisors = 1, pair;
        for (int i = 2; i<=Math.sqrt(number); i++){
            if (number % i == 0)
                sumOfDivisors += i;
            pair = number/ i;
            if (pair != i)
                sumOfDivisors += pair;
        }
        if(sumOfDivisors == number)
            System.out.println(number+" is a prefect number.");
        else
            System.out.println(number+" is not a perfect number.");
    }
}
