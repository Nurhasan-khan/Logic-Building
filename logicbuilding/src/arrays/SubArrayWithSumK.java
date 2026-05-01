package arrays;

import java.util.HashMap;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {3,-3,1,1,1};
        System.out.println(getCountBetter(nums,3));
        System.out.println(getCountOptimal(nums,3));
    }
    static int getCountBetter(int[] nums, int target){
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            int sum = 0;
            for (int j = i; j<nums.length; j++){
                    sum += nums[j];
                    if (sum == target)
                        count++;
            }
        }
        return count;
    }
    static int getCountBrute(int[] nums, int k){
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            int sum = 0;
            for (int j = i; j<nums.length; j++){
                for (int m = i; m<=j; m++) {
                    sum += nums[j];
                }
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
    static int getCountOptimal(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;
        map.put(0,1);
        for (int i = 0; i<nums.length; i++){
             preSum += nums[i];
             int diff = preSum-k;
             if(map.containsKey(diff)) {
                 count += map.get(diff);
             }
             map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}
