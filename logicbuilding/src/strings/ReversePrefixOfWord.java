package strings;

class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
    public static String reversePrefix(String word, char ch) {
        int left = 0; 
        int right = word.indexOf(ch);
        if (right == -1) return word;
        char []chArr = word.toCharArray();
        while(left<=right){
            char c = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = c;
            left++;
            right--;
        }
        word = new String(chArr);
        return word;
    }
}