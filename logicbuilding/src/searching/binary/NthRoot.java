package searching.binary;

public class NthRoot {
    public static void main(String[] args) {
        System.out.println(nthRoot(5,32));
        System.out.println(nthRootOptimal(3,27));
    }
    static int nthRoot(int n, int m){
        for (int i = 1; i<=m; i++){
            int power = (int)Math.pow(i,n);
            if (power == m)
                return i;
            else if (power > m)
                break;
        }
        return -1;
    }
    static int nthRootOptimal(int n ,int m){
        int start = 0;
        int end = m;
        while (start<=end){
            int mid = start + (end  - start)/2;
            int power = (int)Math.pow(mid,n);
            if(power == m)
                return mid;
            else if (power > m)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
