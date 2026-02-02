package recursion.basics;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFib(4));
    }
    static int getFib(int n){
        if (n <= 1)
            return n;
        return getFib(n-1) + getFib(n-2);
    }
}
