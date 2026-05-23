package basic.maths;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isEven(5) ? "Even " : "Odd");
    }
    private static boolean isEven(int number){
        return (number & 1) == 0;
    }
}
