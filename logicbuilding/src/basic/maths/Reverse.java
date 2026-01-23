package basic.maths;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the value of N: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("N: "+n);
        n = reverse(n);
        System.out.println("Reverse: "+n);
    }
    static int reverse(int n){
        int reverse = 0, ld;
        while(n!=0){
            ld = n%10;
            reverse = reverse * 10 + ld;
            n  /= 10;
        }
        return reverse;
    }
}
