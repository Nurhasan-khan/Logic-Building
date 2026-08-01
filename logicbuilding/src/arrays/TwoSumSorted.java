package arrays;

class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        for (int x : twoSum(arr,9))
            System.out.print(x+",");
    }
    public static  int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            if(numbers[start] + numbers[end] == target)
                return new int[]{start+1,end+1};
            if(numbers[start]+numbers[end] > target)
                end--;
            else
                start++;
        }
        return new int[]{-1,-1};
    }
}