package strings;

import java.util.Arrays;

public class LongestCommonPrefix{
    public static void main(String[] args) {
        String []str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int left = 0;
        int right = strs.length-1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0, j = 0; i<strs[left].length() && j < strs[right].length(); i++,j++){
            if(strs[left].charAt(i) == strs[right].charAt(i))
                    sb.append(strs[left].charAt(i));
            else
                break;
        }
        return new String(sb);
    }
}
