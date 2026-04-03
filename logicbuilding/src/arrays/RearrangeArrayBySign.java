package arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        for (int val : rearrangeBrute(arr))
            System.out.print(val+",");
        System.out.println();
        for (int val : rearrangeArray(arr))
            System.out.print(val+",");
        System.out.println();
        for (int val : secondVariety(new int[]{-1,2,-3,-4,-3,1}))
            System.out.print(val+",");
    }
    static int[] rearrangeBrute(int[] arr){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int element : arr) {
            if (element >= 0) positive.add(element);
            else negative.add(element);
        }
        for (int i = 0; i<arr.length/2; i++){
            arr[2*i] = positive.get(i);
            arr[2*i+1] = negative.get(i);
        }
        return arr;
    }
    static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positive = 0;
        int negative = 1;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] >= 0) {
                result[positive] = nums[i];
                positive += 2;
            }else {
                result[negative] = nums[i];
                negative += 2;
            }
        }
        return result;
    }
    // negative != positive (pos>neg or neg > pos)
    static int[] secondVariety(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if (arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        if (pos.size() > neg.size()){
            for (int i = 0; i<neg.size(); i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++){
                arr[index] = pos.get(i);
                index++;
            }
        }else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }
}
