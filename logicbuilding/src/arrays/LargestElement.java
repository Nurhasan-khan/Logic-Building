package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scan.nextInt();
        int []arr = new int[n];
        input(arr,n);
        for(int i = 0; i<n; i++)
            System.out.print(arr[i]+",");
        System.out.println("\nLargest Element: "+max(arr,0,arr.length-1));
//        Arrays.sort(arr); // Quick Sort ~ nlogn
//        System.out.println("Largest Element: "+arr[n-1]);
    }
    static int getMax(int []arr, int n){
        int max = arr[0];
        for (int i = 1; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    static int max(int []arr,int low , int high){
        if (low == high)
            return arr[low];
        int mid = (low + high)/2;
        int max1 = max(arr,low,mid);
        int max2 = max(arr,mid+1,high);
        return Math.max(max1, max2);
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(100);
        }
    }
}
