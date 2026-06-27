package searching.binary;

class KThMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(bruteKthPositive(arr,k));
        System.out.println(findKthPositive(arr,k));
    }
    static int bruteKthPositive(int[] arr , int k){
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] <= k)
                k++;
            else
                break;
        }
        return k;
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int missing = arr[mid] - (mid + 1);
            if (missing >= k)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return k + end + 1;
    }
}