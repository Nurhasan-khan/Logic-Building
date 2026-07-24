package strings;


public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("a","aa"));
    }
    public static char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }
        int sSum = 0;
        for (int i = 0; i<s.length(); i++){
            sSum += s.charAt(i);
        }
        int tSum = 0;
        for (int i = 0; i<t.length(); i++){
            tSum += t.charAt(i);
        }
        return (char) (tSum - sSum);
    }
}
