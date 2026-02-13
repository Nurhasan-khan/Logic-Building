package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []arr = new int[n];
        input(arr,n);
        System.out.println("Array Before Sorting: ");
        for (int ele : arr){
            System.out.print(ele+",");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nArray After Sorting: ");
        for (int ele : arr){
            System.out.print(ele+",");
        }
    }
    static void mergeSort(int []arr, int low, int high){
        if (low >= high) return;
        int mid = (low+high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int []arr, int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(10000);
        }
    }
}
