package recursion.basics;

public class PrintingNumbers {
    public static void main(String[] args) {
//        print(1,10);
        printInverse(5,5);
    }
    static void print(int i , int n){
        if (i > n)
            return;
        System.out.println(i);
        print(i+1, n);
    }
    static void printInverse(int i , int n) {
        if (i < 1)
            return;
        System.out.println(i);
        printInverse(i-1 , n);
    }
}
