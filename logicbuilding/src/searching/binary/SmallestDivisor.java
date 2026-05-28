package searching.binary;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(minimumDivisorBrute(nums,threshold));
        System.out.println(minimumDivisorOptimal(nums,threshold));
    }
    static int minimumDivisorBrute(int[]nums , int threshold ){
        if (nums.length > threshold) return  -1;
        int maxElement = Arrays.stream(nums).max().getAsInt();
        for (int i = 1; i<=maxElement; i++){
            if(isValidDivisor(nums,i,threshold))
                return i;
        }
        return -1;
    }
    static int minimumDivisorOptimal(int[] nums, int threshold){
        if (nums.length > threshold) return -1;
        int max = Arrays.stream(nums).max().getAsInt();
        int start = 1;
        int end = max;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (isValidDivisor(nums,mid,threshold)){
                ans = mid;
                end = mid - 1;
            }else
                start =  mid + 1;
        }
        return ans;
    }
    static boolean isValidDivisor(int[] nums, int divisor, int threshold){
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / divisor);
        }
        return sum <= threshold;
    }
}
