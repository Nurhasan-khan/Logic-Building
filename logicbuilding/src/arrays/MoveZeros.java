package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int []arr =  {1,0,2,3,2,0,0,4,5,1};
        moveZeroBruteForce(arr,arr.length);
        moveZeroOptimal(arr,arr.length);
        Arrays.stream(arr).forEach(System.out::print);
    }
    static void moveZeroBruteForce(int []arr, int n){
        int []temp = new int[20];
        int index = 0;
        for (int i = 0; i<n; i++){
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
//        Arrays.stream(temp).forEach(System.out::print);
        for (int i = 0; i<n; i++){
            arr[i] = temp[i];
        }
    }
    static void moveZeroOptimal(int []arr, int n){
        int j = -1;
        for (int i = 0; i<n; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1 ) return;
        for (int i = j+1; i<n; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
