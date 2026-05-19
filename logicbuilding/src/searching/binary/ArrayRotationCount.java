package searching.binary;

public class ArrayRotationCount {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(getCount(nums));
        System.out.println(getCountBetter(nums));
        System.out.println(getCountOptimal(nums));
    }
    static int getCount(int[] nums){
        int minValIndex = 0;
        for (int i = 1; i< nums.length; i++){
           if (nums[minValIndex] > nums[i])
               minValIndex = i;
        }
        return minValIndex;
    }
    static int getCountBetter(int[] nums){
        for (int i = 0; i< nums.length-1; i++){
            if (nums[i] > nums[i+1])
                return i+1;
        }
        return 0;
    }
    static int getCountOptimal(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
}
