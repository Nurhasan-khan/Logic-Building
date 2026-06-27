package basic.maths;

public class power {
    public static void main(String[] args) {
        System.out.println(getPowerBrute(2.00000,-2));
        System.out.println(optimalPower(2.00000,-2147483648));
    }
    static double getPowerBrute(double x , double n){
        double ans = 1;
        for (int i = 1; i<=n; i++){
            ans = ans * x;
        }
        return ans;
    }
    static double optimalPower(double x, double n){
        double ans = 1;
        double ogN = n;
        if (n < 0 ){
            n = (-n);
        }
        while (n > 0){
            if (n%2 != 0) {
                ans = ans * x;
                n = n - 1;
            }
            else {
                n = n / 2;
                x = x * x;
            }
        }
        if (ogN < 0) ans = 1/ans;
        return ans;
    }
}
