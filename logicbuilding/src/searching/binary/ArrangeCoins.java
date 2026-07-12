package searching.binary;

/** problem statement
 * You have n coins and you want to build a staircase with these coins.
 * The staircase consists of k rows where the ith row has exactly i coins.
 * The last row of the staircase may be incomplete.
 */
class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long neededCoins = mid * (mid + 1)/2;
            if (neededCoins == n) return (int) mid;
            if(neededCoins > n) end = mid - 1;
            else start = mid + 1;
        }
        return (int) end;
    }
}