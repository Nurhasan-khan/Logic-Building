package recursion.basics;

public class Odd {
    public static void main(String[] args) {
        printOdd(10);
    }
    static void printOdd(int n){
        if ( n == 0)
            return;
        printOdd(n-1);
        if ( n % 2 != 0)
            System.out.print(n+",");
    }
}
