package searching.binary;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        System.out.println("Floor: "+floor(nums,1));
        System.out.println("Ceiling: "+ceiling(nums,11));
    }
    // floor -> greatest no <= target
    static int floor(int[] nums, int x){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] <= x){
                start = mid + 1;
            }else
                end = mid - 1;
        }
        return end;
    }
    // ceiling ->  smallest no >= target
    static int ceiling(int[] nums, int x){
        if (x > nums[nums.length-1])
            return -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] >= x){
                end = mid - 1;
            }else
                start = mid + 1;
        }
        return start;
    }
}
