package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,3,2,5,6,2,4};
        System.out.println(linearSearch(arr,2));
    }
    // last occurrence
    static int linearSearch(int []arr, int target){
        for (int i = arr.length-1; i>=0; i--){
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
