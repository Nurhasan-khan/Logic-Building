package sorting.recursive;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the Size of: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int []list = new int[n];
        input(list,n);
        System.out.println("Array Before Sorting");
        for (int a : list)
            System.out.print(a+",");
        bubbleSort(list,n);
        System.out.println();
        System.out.println("Array After Sorting");
        for (int a : list)
            System.out.print(a+",");
    }

    static void bubbleSort(int []arr, int n){
        int temp;
        if (n==1) return;
        boolean didSwap = false;
        for (int j = 0; j < n-1; j++){
            if (arr[j] > arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didSwap = true;
            }

        }
        if(!didSwap) return;
        bubbleSort(arr, n - 1);
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(10000);
        }
    }
}
