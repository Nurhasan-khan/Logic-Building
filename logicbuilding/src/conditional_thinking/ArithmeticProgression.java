package conditional_thinking;
// AP- sequence of numbers where the difference between consecutive terms is constant
//take Three numbers and check if they are in arithmetic progression
public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int c = new java.util.Scanner(System.in).nextInt();
        System.out.println(isInArithmeticProgression(a, b, c) ? "In Arithmetic" : "Not in Arithmetic");
    }
    private static boolean isInArithmeticProgression(int a, int b, int c){
        return (b-a) == (c-b);
    }
}
