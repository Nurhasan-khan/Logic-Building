package arrays;

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(subarrayPositiveBrute(arr,7));
        System.out.println(longestSubArrayWithSumK(arr,3));
        System.out.println(longestSubarrayTwoPointers(arr,3));
    }
    static int subarrayPositiveBrute(int []arr, int targetSum){
        int maxLength = 0;
        for (int i = 0; i<arr.length; i++) {
            int sum = 0;
            for (int j =  i; j<arr.length; j++) {
                sum += arr[j];
//                for (int k = i; k<=j; k++) {
//                    sum += arr[k];
//                }
                if (sum == targetSum)
                    maxLength =  Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
    static int longestSubArrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = preSum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // store only first occurrence
            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
        }
        return maxLen;
    }
    static int longestSubarrayTwoPointers(int []arr, int k){
        int left = 0, right;
        int sum = 0;
        int maxLen = 0;
        for (right = 0; right<arr.length; right++){
            sum += arr[right];
            while (left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k)
                maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
