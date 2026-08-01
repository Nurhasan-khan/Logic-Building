package basic.maths.bitmanipulation;

class BaseSeven {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
    public static String convertToBase7(int n) {
        if (n == 0) return "0";
        int neg = 0;
        if(n < 0){
            neg = n;
            n = Math.abs(n);
        }
        StringBuilder ans = new StringBuilder();
        while (n != 0){
            ans.append(n%7);
            n = n/7;
        }
        ans.reverse();
        if (neg < 0){
            ans.insert(0,'-');
        }
        return new String(ans);
    }
}