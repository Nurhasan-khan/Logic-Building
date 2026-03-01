package arrays;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
//        rightRotationByOnePlace(arr,arr.length);
//        Arrays.stream(arr).forEach(System.out::print);
//        rightRotationByKthPlace(arr,arr.length,3);
     optimizedRightRotation(arr,arr.length,15);
        Arrays.stream(arr).forEach(System.out::print);
    }
    static void rightRotationByOnePlace(int []arr, int n){
        int temp = arr[n-1];
        for (int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    static void rightRotationByKthPlace(int []arr, int n, int k){
        k = k%n;
        int []temp = new int[k];
        for (int i = n-k; i<n; i++){
            temp[i - (n-k)] = arr[i];
        }
//        int j = arr.length-1;
        for (int i = n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }
        for(int i = 0; i<k; i++){
            arr[i] = temp[i];
        }
    }
    static void optimizedRightRotation(int []arr, int n, int k){
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static void reverse(int []arr, int start, int end){
        while (end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
