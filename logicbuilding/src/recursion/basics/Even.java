package recursion.basics;

public class Even {
    public static void main(String[] args) {
        printEven(10);
    }
    static void printEven(int n){
        if ( n == 0)
            return;
        printEven( n-1);
        if (n % 2 == 0)
            System.out.print(n+",");
    }
}
