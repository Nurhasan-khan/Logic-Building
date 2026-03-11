package arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4,5,6,7};
        int arr2[] = {2,3,3,5,6,6,7};

        List<Integer> list = intersect(arr1,arr2);
        System.out.println(list);
        System.out.println(intersectTwoPointer(arr1,arr2));
    }
    public static List<Integer> intersect(int arr1[], int []arr2){
        List<Integer> intersect = new ArrayList<>();
        int[] visited = new int[arr2.length];
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if (arr1[i] == arr2[j] && visited[j] == 0){
                    intersect.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }else if (arr2[j] > arr1[i]) break;
            }
        }
        return intersect;
    }
    static List<Integer> intersectTwoPointer(int []arr1, int []arr2){
        List<Integer> intersect = new ArrayList<>();
        int i = 0 , j = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] == arr2[j]){
                intersect.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i] < arr2[j])
                i++;
            else
                j++;
        }
        return intersect;
    }
}
