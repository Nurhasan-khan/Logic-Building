package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scan.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Elements: ");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println(isSorted(arr,n) ? "\nSorted" : "\nUnsorted");
        scan.close();
    }
    static boolean isSorted(int []arr, int n){
        for (int i = 1; i<n; i++){
            if (arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
