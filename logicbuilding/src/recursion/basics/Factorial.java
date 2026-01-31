package recursion.basics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
        fact(4,1);
    }
    static int fact(int n){
        if (n == 0)
            return 1;
        return n * fact(n-1);
    }

    static void fact(int n , int fact){
        if (n == 0){
            System.out.println(fact);
            return;
        }
        fact(n-1,fact*n);
    }
}
