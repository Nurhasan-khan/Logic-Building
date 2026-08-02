package basic.maths.bitmanipulation;

public class FlippingImage {
    public static void main(String[] args) {
        int [][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for (int[] x : flipAndInvertImage(image)){
            for (int y : x)
                System.out.print(y+",");
            System.out.println();
        }
    }
        public static int[][] flipAndInvertImage(int[][] image) {
            for (int i = 0; i<image.length; i++){
                reverse(image[i]);
            }
            return image;
        }
        static void reverse(int[]rows){
            int left = 0;
            int right = rows.length - 1;
            while (left <= right){
                int temp =  rows[left] ^ 1;
                rows[left] =  rows[right] ^ 1;
                rows[right] = temp;
                left++;
                right--;
            }
        }
}
