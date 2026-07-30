package arrays;

class LuckyNumber {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        int[] map = new int[max+1];
        for (int i = 0; i<arr.length; i++)
            map[arr[i]]++;
        int maxLucky = -1;
        for (int i = 0; i<arr.length; i++){
            if(map[arr[i]] == arr[i])
                maxLucky = Math.max(arr[i],maxLucky);
        }
        return maxLucky;
    }
}