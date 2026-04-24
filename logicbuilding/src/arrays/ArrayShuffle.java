package arrays;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 *
 */
public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        for (int v : shuffle(nums,3))
            System.out.print(v+" ");
    }
    private static int[] shuffle(int[] nums , int n){
        int[] shuffled = new int[2*n];
        int index = 0;
        for (int i = 0; i<n; i++){
            shuffled[index++] = nums[i];
            shuffled[index++] = nums[i+n];
        }
        return shuffled;
    }
}
