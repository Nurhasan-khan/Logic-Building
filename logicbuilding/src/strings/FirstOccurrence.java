package strings;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(find("sadbustsad","sad"));
    }
    static int find(String haystack, String needle){
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;
        for (int i= 0; i<=n-m; i++){
            int j;
            for (j = 0; j<m; j++){
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
            if(j == m) return i;
        }
        return -1;
    }
}
