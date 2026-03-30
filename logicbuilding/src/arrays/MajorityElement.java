package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int []arr = {7,7,5,7,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(getMajority(arr));
        System.out.println(getMajorityBetter(arr));
        System.out.println(mooresVotingAlgo(arr));
    }
    static int getMajority(int []arr){
        for (int i = 0; i< arr.length; i++){
            int count = 0;
            for (int j = 0; j<arr.length; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > Math.floorDiv(arr.length,2))
                return arr[i];
        }
        return -1;
    }
    static int getMajorityBetter(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue() > Math.floorDiv(arr.length,2))
               return entry.getKey();
       }
        return -1;
    }
    static int mooresVotingAlgo(int []arr) {
        int count = 0;
        int ele = -1;
        for (int val : arr) {
            if (count == 0){
                count++;
                ele = val;
            }else if (val == ele) count++;
            else {
                count--;
            }
        }
        int cnt = 0;
        for (int e : arr){
            if (e == ele) cnt++;
        }
        return cnt > arr.length/2 ? ele : -1;
    }
}
