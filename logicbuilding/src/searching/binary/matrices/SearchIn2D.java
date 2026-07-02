package searching.binary.matrices;


public class SearchIn2D {
    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(binarySearch(matrix,29));
    }
    // Where matrix is sorted by row and column wise
    static boolean binarySearch(int[][] matrix,int target){
        int start = 0;
        int end = matrix.length-1;
        while (start < matrix.length && end >= 0){
             if(matrix[start][end] == target)
                 return true;
             else if (matrix[start][end] > target)
                 end--;
             else
                 start++;
        }
        return false;
    }
}
