package strings;

import java.util.HashMap;
import java.util.Map;

class SmallestPalindrome {
    public static void main(String[] args) {
        System.out.println(smallestPalindrome("daccad"));
    }
    public static String smallestPalindrome(String s) {
        if (s.length() <= 1) return s;
       int[] map = new int[26];
        for (char ch : s.toCharArray()){
            map[ch - 'a']++;
        }
        StringBuilder leftHalf = new StringBuilder();
        StringBuilder middle =  new StringBuilder();
        for (char c = 'a'; c<='z'; c++){
            if(map[c-'a'] > 0){
                for(int i = 0; i<map[c-'a']/2; i++)
                    leftHalf.append(c);
                if(map[c-'a'] % 2 != 0)
                    middle.append(c);
            }
        }
        StringBuilder right = new StringBuilder(leftHalf).reverse();
        leftHalf.append(middle);
        leftHalf.append(right);
        return new String(leftHalf);
    }
}