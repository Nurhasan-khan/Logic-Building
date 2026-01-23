package basic.maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(
                getGCD(20,40)
        );
    }
    static int getGCD(int a , int b){
        while (a > 0 && b >0){
            if (a>b) a = a%b;
            else b = b%a;
        }
        if (a==0) return b;
        return a;
    }
}
