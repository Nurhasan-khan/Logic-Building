package arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] result = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        for (int k = arr.length-1; k >= 0; k--){
            if (Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            }else{
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        for(int e : arr)
            System.out.print(e+" ");
        System.out.println();
        for(int e : result)
            System.out.print(e+" ");

    }
}
