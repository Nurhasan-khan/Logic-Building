package searching.binary;

public class SearchInInfinityArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7,8,10,11,12,15,22,23,30};
        System.out.println(findRange(nums,23));
    }
    static int findRange(int[] nums,int target){
        int start = 0;
        int end = 1;
        while (target>nums[end]){
            int newStart = end + 1;
            end = end + ((end - start + 1 )* 2) ;
            start = newStart;
            if (end >= nums.length) {
                end = nums.length - 1;
            }// to avoid runtime exception
        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] nums, int target,int start, int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
