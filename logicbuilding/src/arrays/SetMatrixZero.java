package arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}
        };
        System.out.println("Before: ");
        for (int[] i : matrix){
            for (int j : i)
                System.out.print(j+",");
            System.out.println();
        }
//        setZeroBrute(matrix);
//        setZerosBetter(matrix);
        setZerosOptimal(matrix);
        System.out.println("After: ");
        for (int[] i : matrix){
            for (int j : i)
                System.out.print(j+",");
            System.out.println();
        }
    }
    private static void setZeroBrute(int[][] matrix){
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    markRow(matrix, i);
                    markColumn(matrix, j);
                }
            }
        }
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }
    static void setZerosOptimal(int[][] matrix){
        int cols = 1;
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        cols = 0;
                }
            }
        }
        for (int i = matrix.length-1; i>=0; i--){
            for (int j = matrix[i].length-1; j>=0; j--){
                if(j != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }else{
                    if (cols == 0)
                        matrix[i][0] = 0;
                }
            }
        }
    }
    private static void setZerosBetter(int[][] matrix){
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if(row[i] == 1|| column[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    private static void markRow(int[][] matrix, int i){
        for (int j = 0; j<matrix[i].length; j++){
            if (matrix[i][j] != 0)
                matrix[i][j] = -1;
        }
    }
    private static void markColumn(int[][] matrix, int j){
        for (int i = 0; i<matrix.length; i++){
            if (matrix[i][j] != 0)
                matrix[i][j] = -1;
        }
    }
}
