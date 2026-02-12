package sorting;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []arr = new int[n];
        input(arr,n);
        System.out.println("Before Swapping: ");
        for (int ele : arr)
            System.out.print(ele+",");
        insertionSort(arr,n);
        System.out.println("\nAfter Swapping: ");
        for (int ele : arr)
            System.out.print(ele+",");

    }
    static void insertionSort(int []a, int n){
        int j, temp;
        for (int i = 0; i<=n-1; i++){
            j = i;
            while (j>0 && a[j-1] > a[j]){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    static void input(int a[], int n){
        Random ran = new Random();
        for (int i = 0; i<n;i++){
            a[i] = ran.nextInt(100000);
        }
    }
}
