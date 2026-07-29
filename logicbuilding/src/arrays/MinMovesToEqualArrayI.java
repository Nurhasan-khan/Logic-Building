package arrays;

class MinMovesToEqualArrayI {
    public static void main(String[] args) {
        int arr[] = {1,1,1000000000};
        System.out.println(minMoves(arr));

    }
    public static int minMoves(int[] nums) {
         int min = Integer.MAX_VALUE;
        for (int x : nums){
            if (min > x)
                min  = x;
        }
        int sum = 0;
        for (int x : nums){
            sum += (x - min);
        }
        return sum;
    }
}