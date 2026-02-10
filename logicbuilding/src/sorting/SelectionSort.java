package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []a = {1,500,3,100,9,8,6,};
        selectionSort(a);
        Arrays.stream(a).forEach(System.out::print);
    }
    public static void selectionSort(int []a){
        int minIndex;
        for (int i = 0; i<a.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j<a.length; j++){
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

    }


}
