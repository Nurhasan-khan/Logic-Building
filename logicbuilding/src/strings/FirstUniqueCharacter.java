package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
//        int[] hash = new int[26];
//        for (char ch : s.toCharArray()){
//            hash[ch - 'a'] +=1;
//        }
//        for (int i = 0; i<s.length(); i++){
//            if (hash[s.charAt(i) - 'a'] == 1)
//                return i;
//        }
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i<s.length(); i++){
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
