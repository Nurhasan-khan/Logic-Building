package arrays;

import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(getSumBrute(arr));
        System.out.println(getSumBetter(arr));
        System.out.println(kadaneAlgo(arr));
        Arrays.stream(maxSubarraySum(arr)).forEach(System.out::print);
    }
    static int getSumBrute(int []arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
           for(int j = i; j<arr.length; j++) {
               int sum = 0;
               for (int k = i; k <= j; k++) {
                   sum += arr[k];
               }
               if (sum > max)
                   max = sum;
           }
        }
        return max;
    }
    static int getSumBetter(int []arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            int sum = 0;
            for (int j = i; j<arr.length; j++){
                sum+=arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }
    static int kadaneAlgo(int []arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
    static int[] maxSubarraySum(int []arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int ansEnd = -1;
        int ansStart = -1;
        for (int i = 0; i<arr.length; i++){
            if (sum == 0)
                start = i;
            sum += arr[i];
            if (sum > max){
                max = sum;
                 ansStart = start;
                 ansEnd = i;
            }
            if (sum < 0)
                sum = 0;
        }
        return new int[]{ansStart,ansEnd};
    }
}
