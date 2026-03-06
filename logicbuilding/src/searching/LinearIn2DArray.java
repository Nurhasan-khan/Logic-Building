package searching;

import java.util.Arrays;

public class LinearIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3,4,},
                {5,6,7},
                {8,9,10,11},
                {27,18,13}
        };
        Arrays.stream(search(arr,arr.length,100)).forEach(System.out::print);
    }
    static int[]  search(int [][]arr, int n, int target){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (arr[i][j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
