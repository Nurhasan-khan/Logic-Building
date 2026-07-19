package strings;

class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        if(s.isBlank())
            return 0;
        int len = 0;
        s = s.strip();
        for (int i = s.length()-1; i>=0; i--){
            if(!Character.isSpaceChar(s.charAt(i)))
                len++;
            else
                break;
        }
        return len;
    }
}