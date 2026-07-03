package searching.binary.matrices;

public class TwoDMatrix1 {
    public static void main(String[] args) {
        int[][] mat = {
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };
        System.out.println(search(mat,9));
        System.out.println(twoDBinary(mat,9));

    }
    static boolean search(int[][] matrix, int target){
        for (int i = 0; i<matrix.length; i++){
            if(matrix[i][0] <= target && matrix[i][matrix[0].length-1] >= target){
                return binarySearch(matrix,i,0,matrix[0].length-1,target);
            }
        }
        return false;
    }
    static boolean binarySearch(int[][] mat, int row,int cStart, int cEnd , int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/ 2;
            if(mat[row][mid] == target) return true;
            if (mat[row][mid] > target) cEnd = mid - 1;
            else cStart = mid + 1;
        }
        return false;
    }
    static boolean twoDBinary(int[][] matrix , int target){
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        while (start <= end){
            int mid = start +(end - start)/2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            if (matrix[row][col] == target) return  true;
            if (matrix[row][col] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
