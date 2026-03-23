package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []arr = {2,6,5,8,11};
        Arrays.stream(bruteForceTwoSum(arr,13)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(betterTwoSum(arr,13)).forEach(System.out::print);
        System.out.println();
        System.out.println(isExistTwoSum(arr,13));
    }
    static int[] bruteForceTwoSum(int []arr, int target){
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] betterTwoSum(int []arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++){
            int rem = target - arr[i];
            if (map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
                map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    static boolean isExistTwoSum(int []arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int sum = arr[left]+arr[right];
            if (sum == target)
                return true;
            else if (sum > target)
                right --;
            else
                left++;
        }
        return false;
    }
}
