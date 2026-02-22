package sorting.recursive;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size of: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []list = new int[n];
        input(list,n);
        System.out.println("Array Before Sorting");
        for (int a : list)
            System.out.print(a+",");
        selectionSort(list,0,n);
        System.out.println();
        System.out.println("Array After Sorting");
        for (int a : list)
            System.out.print(a+",");
    }

   static void selectionSort(int[] arr, int i, int n) {
        if(i==n-1) return;
        int minIndex = i;
        for (int j = i+1; j<n; j++){
            if(arr[j] < arr[minIndex])
                minIndex = j;
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        selectionSort(arr,i+1, n);
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(10000);
        }
    }
}
