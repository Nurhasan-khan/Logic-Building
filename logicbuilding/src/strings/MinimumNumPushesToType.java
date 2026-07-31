package strings;

import java.util.Arrays;


class MinimumNumPushesToType {
    public static void main(String[] args) {
        System.out.println(minimumPushes1("xycdefghij"));
        System.out.println(minimumPushes2("aabbccddeeffgghhiiiiii"));
    }
    public static int minimumPushes1(String word) {
     int clicks = 0;
     for (int i = 0; i<word.length(); i++){
        clicks += (i/8) + 1;
     }
     return clicks;
    }
    public static int minimumPushes2(String word) {
        int[] map = new int[26];
        for(char ch : word.toCharArray())
            map[ch - 'a']++;
        Arrays.sort(map);
        for ( int i = 0; i<map.length/2; i++){
            int temp = map[i];
            map[i] = map[map.length-i-1];
            map[map.length-i-1] = temp;
        }
        int ans = 0;
        for (int i = 0; i<map.length; i++){
            ans += map[i] * ((i/8)+1);
            if (map[i] == 0) break;
        }
    return ans;
    }
}