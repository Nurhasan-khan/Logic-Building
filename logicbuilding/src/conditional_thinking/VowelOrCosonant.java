package conditional_thinking;

public class VowelOrCosonant {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter an alphabet: ");
            char input = new java.util.Scanner(System.in).next().charAt(0);
            if (!Character.isLetter(input)) {
                System.out.println("Invalid input. Please enter an alphabet.");
                continue;
            }
            else {
                System.out.println(isVowel(input) ? "Vowel" : "Consonant");
                break;
            }
        }
    }
    private static boolean isVowel(char character){
        character = Character.toUpperCase(character);
        return character == 'A' || character == 'E' || character == 'I' ||
                character == 'O' || character == 'U';
    }
}
