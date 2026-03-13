package arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,0,1,1,1,1};
        System.out.println(maximumCons(arr));
    }
    static int maximumCons(int []arr){
        int max1 = 0;
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 1){
                count++;
            }else if (arr[i] == 0)
                count = 0;
            max1 = Math.max(max1,count);
        }
        return max1;
    }
}
