package arrays;

import java.util.Arrays;

class MaxProductOfThreeNum {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-1,-2,-3}));
    }
    public static int maximumProduct(int[] nums) {
        int product1 = 1;
        Arrays.sort(nums);
        for (int i = 0; i<3; i++){
            product1 *= nums[nums.length-i-1];
        }
        int product2  = 1;
        product2 *= nums[0] * nums[1] * nums[nums.length-1];

        return (int) Math.max(product1,product2);
    }
}