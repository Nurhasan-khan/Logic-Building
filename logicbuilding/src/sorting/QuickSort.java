package sorting;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []arr = new int[n];
        input(arr,n);
        System.out.println("Array Before Sorting: ");
        for (int ele : arr){
            System.out.print(ele+",");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println("\nArray After Sorting: ");
        for (int ele : arr){
            System.out.print(ele+",");
        }

    }
    static void quickSort(int []arr, int low , int high){
        if (low < high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    static int partition(int []arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high,temp;
        while (i < j){
            while(arr[i] <= pivot && i < high)
                i++;
            while (arr[j] > pivot && j > low)
                j--;
            if(i < j){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return  j;
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(100);
        }
    }
}
