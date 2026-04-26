package arrays;

import java.util.ArrayList;
import java.util.List;

class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while(index<nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                index++;
            }
        }
        for (int i = 1; i<=nums.length; i++){
            if(nums[i-1] != i)
                list.add(i);
        }
        return list;
    }
}