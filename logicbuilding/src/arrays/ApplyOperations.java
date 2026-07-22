package arrays;
/*
    problem statement :-
    You need to apply n - 1 operations to this array where, in the ith operation (0-indexed),
    you will apply the following on the ith element of nums:

    If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.

After performing all the operations, shift all the 0's to the end of the array.
 */
public class ApplyOperations {
    public static void main(String[] args) {
        int []nums = {1,2,2,1,1,0};
        for (int x : applyOperations(nums))
            System.out.print(x+" ,");
    }
    public static int[] applyOperations(int[] nums) {
        for ( int i = 0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }else{
                continue;
            }
        }
        int j = -1;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        if (j != -1){
            for(int i = j+1; i<nums.length; i++){
                if (nums[i] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
        return nums;
    }

}
