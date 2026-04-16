package arrays;

import java.util.Scanner;
import java.util.function.Supplier;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = new int[30];
        System.out.print("Enter the Size: ");
        int size = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i<size; i++){
            arr[i] = new java.util.Scanner(System.in).nextInt();
        }
        for(int i = 0; i<size; i++)
            System.out.print(arr[i]+" ");
//        size = deleteAtEnd(arr,size);
//        size = deleteAtEnd(arr,size);
//        size = deleteAtEnd(arr,size);
//        System.out.println("\nAfter Deleting: ");
//        for(int i = 0; i<size; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println("\nAfter Deleting From Beginning: ");
//        size = deleteAtBeginning(arr,size);
//        for(int i = 0; i<size; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println("\nAfter Deleting From specified position: ");
//        size = deleteAtGivenPosition(arr,2,size);
//        for(int i = 0; i<size; i++)
//            System.out.print(arr[i]+" ");
        System.out.println("\nAfter Deleting a Value: ");
        size = deleteByValue(arr,3,size);
            for(int i = 0; i<size; i++)
                System.out.print(arr[i]+" ");

    }
    private static int deleteAtEnd(int[] arr, int size){
        return size - 1;
    }
    private static int deleteAtBeginning(int[] arr, int size){
        for (int i = 0; i<size; i++)
            arr[i] = arr[i+1];
        return size - 1;
    }
    private static int deleteAtGivenPosition(int[] arr, int pos, int size){
        for (int i = pos-1; i<size; i++)
            arr[i] = arr[i+1];
        return size-1;
    }
    private static int deleteByValue(int[]arr, int val, int size){
        int valIdx = -1;
        for (int i = 0; i<size; i++){
            if (arr[i] == val) {
                valIdx = i;
                break;
            }
        }
        if(valIdx != -1) {
            for (int i = valIdx; i < size; i++)
                arr[i] = arr[i + 1];
        }
        return size-1;
    }
}
