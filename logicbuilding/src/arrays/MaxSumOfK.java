package arrays;

import java.util.HashSet;

// Distinct
public class MaxSumOfK {
    public static void main(String[] args) {
        int[] nums = {5,3,3,1,1};
        System.out.println(maximumSubarraySum(nums,3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) return -1;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int maxSum = 0;
        int i = 0;
        for (int j = 0; j<nums.length; j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            if (j-i+1 == k){
                maxSum = Math.max(maxSum,sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        return maxSum;
    }
}
