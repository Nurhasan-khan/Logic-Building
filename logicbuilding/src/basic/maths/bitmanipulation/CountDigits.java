package basic.maths.bitmanipulation;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(getCountDecimal(12345));
        System.out.println(getCountBinary(16));
    }
    static int getCountDecimal(int n){
        return (int) Math.log10(n) + 1;
    }
    static int getCountBinary(int n){
        return (int) (Math.log(n)/ Math.log(2)) + 1;
    }
}
