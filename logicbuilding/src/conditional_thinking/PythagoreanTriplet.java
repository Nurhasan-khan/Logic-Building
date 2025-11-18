package conditional_thinking;


//Take three numbers and check if they can form a Pythagorean triplet
public class PythagoreanTriplet {
    public static void main(String[] args) {
        try {
            System.out.println("Enter Three Positive Integers: ");
            int a = new java.util.Scanner(System.in).nextInt();
            int b = new java.util.Scanner(System.in).nextInt();
            int c = new java.util.Scanner(System.in).nextInt();
            if(a <=0 || b <=0 || c <=0)
                throw new RuntimeException("Please enter only positive integers.");
            System.out.println(isPythagoreanTriplet(a, b, c) ? "Pythagorean Triplet" : "Not a Pythagorean Triplet");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean isPythagoreanTriplet(int a, int b, int c){
        return (a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b);
    }
}
