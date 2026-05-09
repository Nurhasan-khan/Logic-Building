package searching.binary;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,4,6,9,11,12,14,20,36,48};
        System.out.println(binarySearch(nums,36));
        System.out.println(recursiveBinarySearch(nums,120,0, nums.length-1));
        int [] arr = {90,73,65,43,20,15,4,2};
        System.out.println(binaryDescending(arr,20));
        System.out.println(orderAgnosticBinarySearch(arr,2));
    }
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
        }
        return -1;
    }
    static int binaryDescending(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                end = mid - 1;
            else if (nums[mid] > target)
                start = mid + 1;
        }
        return -1;
    }
    static int recursiveBinarySearch(int[] nums, int target,int start ,  int end){
        if (start > end)
            return -1;
        int mid = start + (end - start)/2;
        if (nums[mid] == target)
                return mid;
        else if (nums[mid] < target)
                return recursiveBinarySearch(nums, target, mid+1,  end);
        else
                return recursiveBinarySearch(nums, target, start, mid -1);
        }
        static int orderAgnosticBinarySearch(int[] nums, int target){
            if (nums[0] < nums[nums.length-1]){
                return binarySearch(nums, target);// ascending
            }else
                return binaryDescending(nums,target);// descending
        }
    }

