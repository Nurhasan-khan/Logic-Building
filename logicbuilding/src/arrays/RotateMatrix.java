package arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for (int[] row : matrix){
            for (int v : row){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        System.out.println("After Rotation: ");
        rotateMatrices(matrix);
        for (int[] row :matrix){
            for (int v : row){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    // 90 degree
    static int[][] rotateMatrix(int[][] matrix){
        int[][] result  = new int[matrix.length][matrix[0].length];
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                result[j][matrix.length-i-1] = matrix[i][j];
            }
        }
        return result;
    }
    static void rotateMatrices(int[][] matrix){
        for (int i = 0; i<matrix.length-1; i++){
            for (int j = i+1; j<matrix[0].length; j++){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
            }
        }
        for (int i = 0; i<matrix.length; i++){
                int left = 0;
               reverse(matrix,i,left,matrix[i].length-1);
        }

    }
    static void reverse(int[][] matrix, int i , int j, int right){
        while(j<right){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][right];
            matrix[i][right] = temp;
            j++;
            right--;
        }
    }
}
