package conditional_thinking;
// GP - Sequence of number where each term is obtained by multiplying the previous term by a constant
//Take  Three numbers and check if they are in geometric progression
public class GeometricProgression {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers: ");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int c = new java.util.Scanner(System.in).nextInt();
        System.out.println(isInGeometricProgression(a, b, c) ? "In Geometric Progression"
                : "Not in Geometric Progression");

    }
    private static boolean isInGeometricProgression(int a, int b, int c){
        if(a == 0 || b == 0) return false; // to avoid division by zero
        return (b/a) == (c/b);
    }
}
