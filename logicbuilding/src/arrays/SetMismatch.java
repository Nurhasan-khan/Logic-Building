package arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int nums[] = {3,3,1};
        for (int v : findError(nums))
            System.out.print(v +" ");
    }
    static int[] findError(int[] nums){
        int duplicate = -1;
        int missing = -1;
        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else
                i++;
        }
       for(int j = 0; j< nums.length; j++){
           if (nums[j] != j + 1){
               missing = j+1;
               duplicate = nums[j];
               break;
           }
       }
        return new int[]{duplicate,missing};
    }
}
