package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
//        List<Integer> nexPer = nextPermutation(arr);
////        System.out.println(nexPer);
        nextPermut(arr);
        for (int val : arr)
            System.out.print(val+",");
    }

    private static int[] nextPermut(int[] arr) {
        int index = -1;
        for (int i = arr.length-2; i>=0; i--){
            if (arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if (index == -1){
            reverse(arr,0,arr.length-1);
            return arr;
        }
        for (int i = arr.length-1; i>index; i--){
            if (arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr,index+1,arr.length-1);
        return arr;
    }
    private static void reverse(int[]arr , int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static List<Integer> nextPermutation(int[] nums){
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int num : nums) current.add(num);
        Arrays.sort(nums);
        permute(nums,0,all);
        for (int i = 0; i<all.size(); i++){
            if (all.get(i).equals(current)) {
                if (i == all.size() - 1)
                    return all.get(0);
                return all.get(i+1);
            }
        }
        return current;
    }
    private static void permute(int[] nums , int start , List<List<Integer>> all){
        if (start == nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            all.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start ; i<nums.length; i++){
            swap(nums,i,start);
            permute(nums,start+1,all);
            swap(nums,i,start);
        }
    }
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}