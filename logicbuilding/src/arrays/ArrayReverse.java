package arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int v : arr)
            System.out.print(v+" ");
        System.out.println();
//        reverseBrute(arr);
//        reverseOptimal(arr);
        reverseSubarray(arr,2,4);
        for(int v : arr)
            System.out.print(v+" ");
    }
    private static void reverseBrute(int[] arr){
        int[] auxiliary = new int[arr.length];

        for (int i =0; i< arr.length; i++){
            auxiliary[i] = arr[arr.length-i-1];
        }
        for (int i = 0; i<arr.length; i++)
            arr[i] = auxiliary[i];
    }
    private static void reverseOptimal(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    private static void reverseSubarray(int[] arr, int start , int end){
        int left = start;
        int right = end;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
