package arrays.sllidingwindow;

class MaxAvgSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        int frame = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
             if ( i >= k - 1){
                max  = Math.max(sum/k, max);
                 sum -= nums[frame];
                 frame += 1;
             }
        }
        return max;
    }
}