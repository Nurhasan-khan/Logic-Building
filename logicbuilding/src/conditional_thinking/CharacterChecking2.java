package conditional_thinking;
//Take a character and check if it is a letter, a digit, or neither
public class CharacterChecking2 {
    public static void main(String[] args) {
        System.out.println("Enter a Character: ");
        char character = new java.util.Scanner(System.in).next().charAt(0);
        checkCharacter(character);

    }
    private static void checkCharacter(char character){
        if ((character >= 'A' && character <= 'Z') ||
                (character >= 'a' && character <= 'z')) {
            System.out.println(character + " is a letter.");
        } else if( character>='0'&& character <= '9') {
            System.out.println(character+" is a Digit");
        }
        else{
            System.out.println("neither a letter nor a digit");
        }
    }
}
