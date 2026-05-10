package searching.binary;
// upper bound -> smallest index such that arr[index] > x
public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {3,5,8,9,15,19};
        System.out.println(upperBound(nums,9));
    }
    static int upperBound(int[] nums, int x){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] > x){
                ans = mid;
                end = mid - 1;
            }else if (nums[mid] <= x)
                start = mid + 1;
        }
        return ans;
    }
}
