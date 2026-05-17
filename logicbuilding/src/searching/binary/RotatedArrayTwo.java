package searching.binary;
// contains duplicates
public class RotatedArrayTwo {
    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,3,3,3,4,5,6};
        System.out.println(bruteSearch(nums,0));
        System.out.println(search(nums,0));
    }
    static boolean bruteSearch(int[] nums, int target){
        for (int num : nums)
            if (num == target)
                return true;
        return false;
    }
    static boolean search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target) return true;
            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                start += 1;
                end -= 1;
                continue;
            }
            if (nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] >= target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }else{
                if (nums[mid] <= target && nums[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}
