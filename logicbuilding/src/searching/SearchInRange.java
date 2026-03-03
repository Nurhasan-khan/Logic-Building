package searching;

public class SearchInRange {
    public static void main(String[] args) {
        int []arr = {-1,18,2,3,11,14,1,5};
        System.out.println(search(arr,11,2,4));
    }
    static int search(int []arr, int target, int start, int end){
        if(arr.length == 0)
            return -1;
        for (int i = start; i<=end; i++){
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
