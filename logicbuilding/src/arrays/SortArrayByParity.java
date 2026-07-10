package arrays;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        for( int e : optimal(arr))
            System.out.print(e+",");
    }
    static int[] sort(int[] arr){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        int j = 0;
        for (int i = 0; i<even.size(); i++){
            arr[j] = even.get(i);
            j++;
        }
        for(int i = 0; i<odd.size(); i++){
            arr[j] = odd.get(i);
            j++;
        }
        return arr;
    }
    static int[] optimal(int[] arr){
        if(arr.length < 1)
            return arr;
        int j = -1;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] % 2 != 0){
                j = i;
                break;
            }
        }
        if(j==-1)
            return arr;
        for (int i = j+1; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
