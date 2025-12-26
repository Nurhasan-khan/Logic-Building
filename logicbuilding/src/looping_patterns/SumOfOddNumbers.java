package looping_patterns;
//Q. Print the sum of all odd numbers up to n
public class SumOfOddNumbers {
        public static void main(String[] args) {
            System.out.println("Enter the n Value: ");
            int n = new java.util.Scanner(System.in).nextInt();
            int sum = 0;
            for (int i = 0; i<=n; i++){
                if (i%2!=0)
                    sum += i;
            }
            System.out.println("Sum of Odd Numbers UpTO N: "+sum);
    }
}
