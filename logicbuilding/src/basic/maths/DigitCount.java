package basic.maths;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println("Enter the value of N: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("N: "+n);
        int count = countDigits(n);
        System.out.println("Number of digits in N: "+count);
    }
    static int countDigits(int n){
        return (int) (Math.log10(n) + 1);
    }
}
