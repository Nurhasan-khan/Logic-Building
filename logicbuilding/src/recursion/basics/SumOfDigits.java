package recursion.basics;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(0,11111));
    }
    static int sumOfDigits(int sum, int num){
        if (num == 0){
            return sum;
        }
        return sumOfDigits(sum+(num%10),num/10);
    }
}
