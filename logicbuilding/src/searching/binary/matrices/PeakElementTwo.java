package searching.binary.matrices;

import java.util.Arrays;

public class PeakElementTwo {
    public static void main(String[] args) {
        int[][] matrix = {
                {4,2,5,1,4,5},
                {2,9,3,2,3,2},
                {1,7,6,0,1,3},
                {3,6,2,3,7,2}
        };
        Arrays.stream(getPeak(matrix)).forEach(System.out::print);
    }
    static int[] getPeak(int[][] mat){
        int start = 0;
        int end = mat[0].length-1;
        while (start<=end){
           int  mid = start + (end - start)/2;
           int row = maxElement(mat, mat.length,mid);
           int left  = mid-1 >= 0 ? mat[row][mid-1] : -1;
           int right = mid+1 < mat[0].length ? mat[row][mid+1] : -1;
           if (mat[row][mid] > left && mat[row][mid] > right)
               return new int[]{row,mid};
           if (mat[row][mid] < left) end = mid - 1;
           else start = mid + 1;
        }
        return new int[]{-1,-1};
    }
    static int maxElement(int[][] mat, int row,int col){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i<row; i++){
            if(mat[i][col] > max) {
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
