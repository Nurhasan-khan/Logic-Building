package conditional_thinking;

public class AlphaRange {
    public static void main(String[] args) {
        System.out.println("Enter a single alphabet character: ");
        char input = new java.util.Scanner(System.in).next().charAt(0);
        if(checkAlphaRange(input) != null)
         System.out.println(checkAlphaRange(input));
        else
            System.out.println("Invalid input. Please enter an alphabet character.");
    }
    private static String checkAlphaRange(char character){
        if(Character.isLetter(character)){
            character = Character.toUpperCase(character);
            if(character >= 'A' && character <= 'M')
                return "A-M";
            else
                return "N-Z";
        }else
            return null;
    }
}
