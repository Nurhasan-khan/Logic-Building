package searching.binary;
// lower bound -> first arr[index] that is >= X
public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {2,3,8,15,19,19,19,19};
        System.out.println(lowerBound(nums,19));
    }
    static int lowerBound(int[] nums, int x){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] >= x){
                ans = mid;
                end = mid - 1;
            }else if (nums[mid] < x)
                start = mid + 1;
        }
        return ans;
    }
}
