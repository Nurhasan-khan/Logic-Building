package strings;

import java.util.Stack;

public class RemovingStars {
    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }
    static String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            }else
                stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack){
            sb.append(c);
        }
        return new String(sb);
    }
}
