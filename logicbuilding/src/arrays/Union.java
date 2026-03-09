package arrays;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5,6,7};
        int arr2[] = {2,3,4,4,5,6,10};
        for(int i : unionUsingSet(arr1,arr2))
            System.out.print(i+",");
        System.out.println();
        for(int i : unionUsingMap(arr1,arr2))
            System.out.print(i+",");
        System.out.println();
        List<Integer> list = twoPointer(arr1,arr2);
        System.out.println(list);

    }
    static int[] unionUsingSet(int []arr1, int []arr2){
        TreeSet<Integer> unique = new TreeSet<>();
        int index = 0;
        for (int k : arr1) {
            unique.add(k);
        }
        for (int j : arr2) {
            unique.add(j);
        }
        int []union = new int[unique.size()];
        for (int ele : unique){
            union[index] = ele;
            index++;
        }
        return union;
    }
    static int[] unionUsingMap(int []arr1, int []arr2){
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        for (int j : arr1) {
            freq.put(j, freq.getOrDefault(j, 0) + 1);
        }
        for (int j : arr2) {
            freq.put(j, freq.getOrDefault(j, 0) + 1);
        }
        int []union = new int[freq.size()];
        int idx = 0;
        for (int key : freq.keySet()){
            union[idx] = key;
            idx++;
        }
        return union;
    }
    static List<Integer> twoPointer(int []arr1, int []arr2){
        List<Integer> union = new ArrayList<>();
        int i = 0; int j = 0;
        int index = 0;
        while(i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]) {
                if(union.isEmpty()|| union.get(union.size()-1) != arr1[i] )
                    union.add(arr1[i]);
                i++;
            }else if (union.isEmpty() || arr2[j] < arr1[i]){
                if (union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while (i<arr1.length){
            if (union.get(union.size()-1) != arr2[i])
                union.add(arr1[i]);
            i++;
        }
        while (j<arr2.length){
            if (union.get(union.size()-1) != arr2[j])
                 union.add(arr2[j]);
            j++;
        }
        return union;
    }
}
