package searching.binary;

public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(getSqrt(36));
        System.out.println(getSqrtOptimal(10));
    }
    //linear search
    static int getSqrt(int num){
        int ans = 1;
        for (int i = 0; i<num; i++){
            if (i*i <= num)
                ans = i;
            else
                break;

        }
        return ans;
    }
    //binary search
    static int getSqrtOptimal(int num){
        int ans = 1;
        int start = 0;
        int end = num;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid * mid <= num){
                ans = mid;
                start = mid + 1;
            }else
                 end = mid - 1;
        }
        return ans;
    }
}
