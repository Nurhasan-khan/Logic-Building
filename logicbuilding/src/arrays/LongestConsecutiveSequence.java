package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        System.out.println(longestSequenceBrute(arr));
//        Arrays.sort(arr);
//        System.out.println(longestConsecutiveBetter(arr));
        System.out.println(longestConsecutiveOptimal(arr));
    }
    private static int longestSequenceBrute(int[] arr){
        int longest = 1;
        for (int i = 0; i<arr.length; i++){
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr,x+1)){
                x = x + 1;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    private static int longestConsecutiveBetter(int[] arr){
        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;
        int longest = 1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] - 1 == lastSmallest){
                count++;
                lastSmallest = arr[i];
            }else if (arr[i] != lastSmallest){
                lastSmallest  = arr[i];
                 count = 1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    private static int longestConsecutiveOptimal(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for (int i  = 0; i<arr.length; i++)
            set.add(arr[i]);
       for (int val : set){
           if (!set.contains(val-1)) {
               int x = val;
               int count = 1;
               while (set.contains(x + 1)) {
                   x += 1;
                   count += 1;
               }

               longest = Math.max(longest, count);
           }
       }
       return longest;
    }
    private static boolean linearSearch(int []arr,int x){
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x)
                return true;
        }
        return false;
    }
}
