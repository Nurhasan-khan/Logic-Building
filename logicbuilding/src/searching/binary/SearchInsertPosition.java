package searching.binary;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,8};
        System.out.println(search(nums,3));
    }
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid]>= target){
                ans = mid;
                end = mid - 1;
            }else if (nums[mid] < target)
                start = mid + 1;
        }
        return ans;
    }
}
