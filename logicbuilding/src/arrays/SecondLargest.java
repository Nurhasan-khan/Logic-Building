package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scan.nextInt();
        int []arr = new int[n];
        input(arr,n);
        for(int i = 0; i<n; i++)
            System.out.print(arr[i]+",");
//        Arrays.sort(arr);
//        int max = arr[n-1];
//        int secondMax = 0;
//        for (int i = n-2; i>= 0; i--){
//            if (arr[i] != max) {
//                secondMax = arr[i];
//                break;
//            }
//        }
        System.out.println("\nSecond Largest: "+getSecondMax(arr,n));
    }
    static int getSecondMax(int []arr, int n){
       int large = arr[0];
       int secondLarge = Integer.MIN_VALUE;
       for(int i = 0; i<n; i++){
           if (arr[i] > large){
               secondLarge = large;
               large = arr[i];
           } else if (arr[i] > secondLarge && arr[i] != large) {
               secondLarge = arr[i];
           }
       }
       return secondLarge;
    }
    static void input(int []arr, int n){
        Random ran = new Random();
        for (int i = 0; i<n; i++){
            arr[i] = ran.nextInt(100);
        }
    }
}
