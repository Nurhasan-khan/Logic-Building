package basic.maths;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println(isPerfect(num));
    }
    static boolean isPerfect(int num){
        if(num == 1) return false;
        int sum = 1;
        for (int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                sum += i;
                if(i != num/i) sum += num/i;
            }
        }
        return num == sum;
    }
}
