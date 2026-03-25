package arrays;

public class SortColor {
    public static void main(String[] args) {
        int []arr = new int[]{0,1,2,0,1,2,1,2,0,0,0,1};
//        sortColorsBetter(arr);
        sortColorsOptimal(arr);
        for (int ele : arr)
            System.out.print(ele+",");

    }
    static void sortColorsBetter(int []arr){
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 0) countZeros++;
            else if (arr[i] == 1) countOnes++;
            else if (arr[i] == 2)countTwos++;
        }
        for (int i = 0; i<countZeros; i++)
            arr[i] = 0;
        for (int i = countZeros; i<countZeros+countOnes; i++)
            arr[i] = 1;
        for (int i = countZeros+countOnes; i<arr.length; i++)
            arr[i] = 2;
    }
    static void sortColorsOptimal(int []arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) mid++;
            else if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
