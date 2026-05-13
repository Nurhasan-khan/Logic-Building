package searching.binary;

public class SmallestLetter {
    public static void main(String[] args) {
        System.out.println(smallestLetterGreaterThanTarget(new char[]{'c','f','j'}, 'a'));
    }
    static char smallestLetterGreaterThanTarget(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        char ans = letters[0];
        if (target > letters[letters.length-1])
            return ans;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if (letters[mid] > target){
                ans = letters[mid];
                end = mid - 1;
            }else
                start = mid + 1;
        }
        return ans;
    }
}
