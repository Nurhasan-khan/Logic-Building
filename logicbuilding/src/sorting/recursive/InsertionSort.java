package sorting.recursive;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size of: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []list = new int[n];
        input(list,n);
        System.out.println("Array Before Sorting");
        for (int a : list)
            System.out.print(a+",");
        insertionSort(list,0,n);
        System.out.println();
        System.out.println("Array After Sorting");
        for (int a : list)
            System.out.print(a+",");
    }
    static void insertionSort(int []arr, int index, int n){
        if(index == n) return;
        int j = index;
        int temp;
        while(j>0 && arr[j-1] > arr[j]) {
            temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr,index+1,n);
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(10000);
        }
    }
}
