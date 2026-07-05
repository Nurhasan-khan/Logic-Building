package searching.binary.matrices;

public class MatrixMedian {
    public static void main(String[] args) {
        int[][] mat = {
                {1,4,9},
                {2,5,6},
                {3,8,7}
        };
        System.out.println(median(mat));
    }
    static int countLess(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end - start)/2;
            if(arr[mid] <= x) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    static int median(int[][] mat){
         int row = mat.length;
         int col = mat[0].length;
         int start = mat[0][0];
         int end = mat[0][col-1];
         for (int i = 1; i<row; i++){
             start = Math.min(start,mat[i][0]);
             end = Math.max(end,mat[i][col-1]);
         }
         while (start<end){
             int mid = start + (end - start)/2;
             int count = 0;
             for (int i = 0; i<row; i++){
                 count += countLess(mat[i],mid);
             }
             if(count < (row * col + 1)/2){
                 start = mid + 1;
             }else{
                 end = mid;
             }
         }
         return start;
    }
}
