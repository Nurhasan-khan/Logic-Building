package searching.binary;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {-2147483648,-2147483647};
        System.out.println(getPeak(nums));
        System.out.println(searchPeak(nums));
    }
    static int getPeak(int[] nums){
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length-1] > nums[nums.length-2])
            return nums.length-1;
        for (int i = 1; i<nums.length-1; i++){
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
        }
        return -1;
    }
    static int searchPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] > nums[mid+1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
//        if (nums.length == 1 || nums[0] > nums[1])
//            return 0;
//        if (nums[nums.length-1] > nums[nums.length-2])
//            return nums.length-1;
//        int start = 1;
//        int end = nums.length-2;
//        while (start<=end){
//            int mid = start + (end - start)/2;
//            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
//                return mid;
//            if(nums[mid] < nums[mid+1])
//                start = mid+1;
//            else
//                end = mid - 1;
//        }
//        return -1;
    }
}
