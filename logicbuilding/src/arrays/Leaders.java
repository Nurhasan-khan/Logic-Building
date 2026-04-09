package arrays;

import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(findLeadersBrute(arr));
        System.out.println(findLeadersOptimal(arr));
    }
    private static List<Integer> findLeadersBrute(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
           boolean isLeader = true;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] >= arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) leaders.add(arr[i]);
        }
        return leaders;
    }
    private static List<Integer> findLeadersOptimal(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        int maxOnRight = Integer.MIN_VALUE;
        for (int i = arr.length-1; i>=0; i--){
            if(arr[i] > maxOnRight){
                maxOnRight = arr[i];
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
}
