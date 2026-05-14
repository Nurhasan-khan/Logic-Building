package searching.binary;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        System.out.println(countBrute(nums,4));
        int start = countOptimal(nums,2,true);
        int end = countOptimal(nums,2,false);
//        System.out.println(start + "" + end);
        System.out.println(end-start);
    }
    public static int countBrute(int[] nums, int x){
        int count = 0;
        for (int i : nums){
            if (i == x)
                count++;
        }
        return count;
    }
    static int countOptimal(int[] nums, int x , boolean isLowerBound){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (!isLowerBound) {
                if (nums[mid] > x) {
                    ans = mid;
                    end = mid - 1;
                }
                else if (nums[mid] <= x)
                    start = mid + 1;
            }else{
                if (nums[mid] >= x) {
                    ans = mid;
                    end = mid - 1;
                }
                else if (nums[mid] < x)
                    start = mid + 1;
            }

        }
        return  ans;
    }
}
