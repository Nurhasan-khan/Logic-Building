package looping_patterns;

public class SumOfFactorials {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int sumOfFactorials = 0, pair;
        for (int i = 1; i<=Math.sqrt(number); i++){
            if (number%i == 0) {
                sumOfFactorials += i;
                pair = number / i;
                if (i != pair)
                    sumOfFactorials += pair;
            }
        }
        System.out.println("Sum of Factorial For "+number+" is: "+sumOfFactorials);
    }
}
