package recursion.basics;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(1203203050));
    }
    static int count(int n){
        int count = 0;
        return helper(n,count);
    }
    static int helper(int n , int count){
        if (n == 0){
            return count;
        }
        if (n%10 == 0)
            return helper(n/10,count+1);
        else
            return helper(n/10,count);
    }
}
