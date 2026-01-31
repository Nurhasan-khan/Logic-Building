package recursion.basics;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        sum(10,0);
        System.out.println(sumFunctional(10));
    }
    static void sum(int n , int sum){
        if ( n < 1){
            System.out.println(sum);
            return;
        }
        sum(n-1, sum + n);
    }
    static int sumFunctional(int n){
        if (n == 0)
            return 0;
       return n + sumFunctional(n-1);
    }
}
