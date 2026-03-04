package arrays;

import java.util.Random;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = scan.nextInt();
        int []arr = new int[n];
        input(arr,n);
        for (int ele : arr)
            System.out.print(ele+",");
        System.out.println();
        System.out.println("Minimum Element: "+min(arr,0,arr.length-1));
        System.out.println("Second Minimum Element: "+getSecondSmallest(arr,n));
    }
    static int getSmallest(int []arr, int n){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            minimum = Math.min(arr[i],minimum);
        }
        return minimum;
    }
    static int getSecondSmallest(int []arr, int n){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            if (arr[i] < min ) {
                secondMin = min;
                min = arr[i];
            }else if (arr[i] < secondMin && arr[i] != min)
                secondMin = arr[i];
        }
        return secondMin;
    }
    static int min(int []arr, int low, int high){
        if (low == high)
            return arr[low];
        int mid  = (low+high) / 2;
        int min1 = min(arr,low,mid);
        int min2 = min(arr,mid+1,high);
        return Math.min(min1,min2);
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(100);
        }
    }
}
