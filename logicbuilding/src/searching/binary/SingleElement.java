package searching.binary;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,3,5,5};
        System.out.println(bruteGetSingle(nums));
        System.out.println(xorGetSingle(nums));
        System.out.println(bSearch(nums));
    }
    static int bruteGetSingle(int[] nums){
        if (nums.length == 1)
            return nums[0];
        for (int i = 0; i< nums.length; i++){
            if (i == 0){
                if (nums[i] != nums[i+1]) return nums[i];
            }else if (i == nums.length - 1){
                if (nums[i] != nums[i-1]) return nums[i];
            }else{
                if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) return nums[i];
            }
        }
        return -1;
    }
    static int xorGetSingle(int[] nums){
        int xor = 0;
        for (int i = 0; i<nums.length; i++)
            xor ^= nums[i];
        return xor;
    }
    static int bSearch(int[] nums){
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length-2]);
        int start = 1;
        int end = nums.length-2;
        while (start<=end){
            int mid = start + (end - start);
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if (mid % 2 == 1 && nums[mid] == nums[mid - 1])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
