package arrays;

import java.util.HashSet;
import java.util.TreeSet;
// Remove Duplicates From a sorted array
public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2,3,3,}));
    }
    static int removeDuplicates(int []nums){
        int i = 0;
        for (int j = 1; j< nums.length; j++){
            if (nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
//    public static int removeDuplicates(int []arr){
//        HashSet<Integer> seen = new HashSet<>();
//        int index = 0;
//        for (int num : arr){
//            if (!seen.contains(num)){
//                seen.add(num);
//                arr[index] = num;
//                index++;
//            }
//        }
//        return index;
//    }
}
