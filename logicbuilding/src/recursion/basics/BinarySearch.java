package recursion.basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,10,0,arr.length-1));
    }
    static int binarySearch(int[] arr , int searchValue,int start, int end){
        int mid = start + (end - start) / 2;
        if(start <= end) {
            if (arr[mid] == searchValue)
                return mid;
            if (arr[mid] < searchValue) {
                 return binarySearch(arr, searchValue, mid + 1, end);
            } else if (arr[mid] > searchValue) {
               return binarySearch(arr, searchValue, start, mid - 1);
            }
        }
       return -1;
    }
}
