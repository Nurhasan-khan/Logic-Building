package conditional_thinking;

public class FirstAndLast {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter Four Digit Number: ");
            int number = new java.util.Scanner(System.in).nextInt();
            if(Integer.toString(number).length() == 4) {
                System.out.println(firstLastIsEqual(number) ? "Equals" : "Not Equals");
                break;
            }
            else
                continue;
        }
    }
    private static boolean firstLastIsEqual(int number){
        return number/1000 == (number%1000)%100%10;
    }
}
