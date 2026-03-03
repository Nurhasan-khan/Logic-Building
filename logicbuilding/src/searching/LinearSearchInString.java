package searching;

public class LinearSearchInString {
    public static void main(String[] args) {
        String text = "Nurhasan";
        char k = 'o';
        System.out.println(search(text,k));
    }
    static boolean search(String s, char k){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == k)
                return true;
        }
        return false;
    }
}
