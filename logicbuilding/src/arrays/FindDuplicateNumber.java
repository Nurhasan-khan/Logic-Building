package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static int findDuplicate(int[] nums){
        int i = 0;
        while (i < nums.length){
            if(nums[i] != i+1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j<nums.length; j++){
            if (nums[j] != j+1)
                list.add(nums[j]);
        }
        return list;
    }
}
