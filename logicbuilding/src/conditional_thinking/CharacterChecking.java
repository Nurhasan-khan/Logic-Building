package conditional_thinking;

public class CharacterChecking {
    public static void main(String[] args) {
            System.out.println("Enter a character: ");
            char input = new java.util.Scanner(System.in).next().charAt(0);
             System.out.println(checkCharType(input));

    }
    private static String checkCharType(char character){
        if(Character.isUpperCase(character))
            return "Uppercase Letter";
        else if (Character.isLowerCase(character))
            return  "Lowercase Letter";
        else if (Character.isDigit(character))
            return "Digit";
        else
            return "Special Character";
    }
}
