package searching.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {2,3,8,15,19,19,19,19};
        System.out.println(firstAndLastOccurrences(nums,8));
        System.out.println(bruteForceApproach(nums,8));
    }
    static List<Integer> firstAndLastOccurrences(int[] nums, int target){
        int firstIndex = lowerBound(nums,target);
        int lastIndex = upperBound(nums, target);
        if (firstIndex == nums.length || nums[firstIndex] != target)
            return List.of(-1,-1);
        return Arrays.asList(firstIndex,lastIndex-1);
    }
    static int lowerBound(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return ans;
    }
    static  int upperBound(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if (target > nums[nums.length-1])
            return  -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] > target)
                end = end - 1;
            else
                start = start + 1;
        }
        return start;
    }
    static List<Integer> bruteForceApproach(int[] nums, int target){
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == target){
                indexes.add(i);
                break;
            }
            if (i == nums.length -1)
                return List.of(-1,-1);
        }
        for (int i = nums.length-1; i>=0; i--){
            if (nums[i] == target){
                indexes.add(i);
                break;
            }
        }
        return indexes;
    }
}
