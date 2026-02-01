package recursion.basics;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(0,"madam"));
    }
    static boolean palindrome(int i ,String s){
        if ( i >= s.length()/2)
            return true;
        if (s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        return palindrome(i+1,s);
    }
}
