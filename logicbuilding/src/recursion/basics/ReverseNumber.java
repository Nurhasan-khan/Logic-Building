package recursion.basics;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(0,12345));
    }
    static int reverse(int reverse, int num){
        if (num == 0){
            return reverse;
        }
        return reverse((reverse*10)+(num%10),num/10);
    }
}
