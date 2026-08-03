package basic.maths.bitmanipulation;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(getNthMagic(5));
    }
    static int getNthMagic(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int bit = n&1;
            ans += bit * base;
            base = base * 5;
            n = n >> 1;
        }
        return ans;
    }
}
