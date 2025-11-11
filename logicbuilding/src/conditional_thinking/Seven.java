package conditional_thinking;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(multipleOrIsEnds(number));

    }
    private static String multipleOrIsEnds(int number){
       if (number % 7 == 0 )
           return "Multiple of Seven";
       else if (number % 10 == 7)
           return "Ends with Seven";
      else
          return "None";
    }
}
