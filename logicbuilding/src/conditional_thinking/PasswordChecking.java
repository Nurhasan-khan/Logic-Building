package conditional_thinking;


//Take a password string and check basic rules (length ≥ 8 and contains at least one
//digit)
public class PasswordChecking {
    public static void main(String[] args) {
        System.out.println("Enter a Password: ");
        String password = new java.util.Scanner(System.in).next();
        System.out.println(checkPassword(password));

    }
    private static String checkPassword(String password){
        if(password.length() >= 8){
            if(password.matches(".*\\d.*"))
                return "Password is Valid.";
            else
                return "Password must contain at least one digit.";
        }
        else
            return "Password must be at least 8 characters long.";
    }
}
