package strings;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(isRotation("abcde","cdeab"));
    }
    static boolean isRotation(String s, String goal){
        if (s.length() != goal.length())
            return false;
        return (s+s).contains(goal);
    }
}
