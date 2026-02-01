package recursion.basics;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        reverse(0,arr);
        Arrays.stream(arr).forEach(System.out::print);

    }
    static void reverse(int []arr){
       int p1 = 0;
       int p2 = arr.length-1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;

        }
    }
    static void reverse(int l ,int []arr, int r){
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l+1,arr,r-1);
    }

    static void reverse(int p, int []arr){
        if (p >= arr.length/2)
            return;
        int temp = arr[p];
        arr[p] = arr[arr.length-p-1];
        arr[arr.length-p-1] = temp;
        reverse(p+1,arr);
    }

}
