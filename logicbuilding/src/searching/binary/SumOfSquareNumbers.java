package searching.binary;
// Given a non-negative integer c, decide whether there're two integers a and b
// such that a2 + b2 = c
class SumOfSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(6));
    }
    public static boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while(left <= right){
            long sum = (left * left) + (right * right);
            if (sum == c)
                return true;
            else if (sum < c)
                left++;
            else
                right--;
        }
        return false;
    }
}