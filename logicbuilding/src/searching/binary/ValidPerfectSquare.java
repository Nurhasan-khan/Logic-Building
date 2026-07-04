package searching.binary;
//constraint no use of build in sqrt
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(64));
    }
    static boolean isPerfectSquare(int num){
        if (num<2) return true;
        long start = 2;
        long end = num/2;
        while (start <= end){
            long mid = start + (end - start)/2;
            if (mid * mid == num) return true;
            if (mid * mid > num) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
