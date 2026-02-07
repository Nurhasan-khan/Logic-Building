package recursion.basics;

public class Power {
    public static void main(String[] args) {
        System.out.println(getPower(2,3));
    }
    static int getPower(int x , int n){
        if (n == 0)
            return 1;
        if ( n%2 == 0)
            return getPower(x,n/2) * getPower(x, n/2);
        else
            return  x * getPower(x,n/2) * getPower(x, n/2);
    }
}
