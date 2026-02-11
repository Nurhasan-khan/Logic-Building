package sorting;

import java.util.Arrays;
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
        for (int a : list)
            System.out.print(a+",");
    }
    static void bubbleSort(int []a,int n){
        boolean noSwaps = true;
        int temp;
        for (int i = n-1; i>=1; i--){
            for (int j = 0 ; j<=i-1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    noSwaps = false;
                }
                if (noSwaps) break;
            }
        }
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(10000);
        }
    }
}
