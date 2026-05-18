package searching.binary;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        System.out.println(getMinBrute(nums));
        System.out.println(getMinOptimal(nums));
    }
    static int getMinBrute(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int val : nums)
            min = Math.min(min,val);
        return min;
    }

    static int getMinOptimal(int[] nums){
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
    }
}
