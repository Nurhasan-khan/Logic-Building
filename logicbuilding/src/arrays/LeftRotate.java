package arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
//        leftRotateByOnePlace(arr,arr.length);
//        Arrays.stream(arr).forEach(System.out::print);
        leftRotationByKthPlace(arr,arr.length,15);
        Arrays.stream(arr).forEach(System.out::print);
    }
    static void leftRotateByOnePlace(int []arr, int n){
        int temp = arr[0];
        for (int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    static void leftRotationByKthPlace(int []arr, int n, int k){
        k = k%n;
        int []temp = new int[k];
        for (int i = 0 ; i<k; i++)
            temp[i] = arr[i];
       for(int i = k; i<n; i++){
           arr[i-k] = arr[i];
       }
       for (int i = n-k; i<n; i++){
           arr[i] = temp[i-(n-k)];
       }
    }
}
