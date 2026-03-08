package arrays;
// Given an array nums of integers, return how many of them contain an even number of digits.
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{1,13,56889,233}));
    }
    static int findNumbers(int []nums) {
        int count = 0;
        for (int num  : nums) {
            if (even(num))
                count++;
        }
        return count;
    }
    static boolean even(int num){
        int count = (int) Math.log10(num) + 1;
        return count % 2 == 0;
    }

}
