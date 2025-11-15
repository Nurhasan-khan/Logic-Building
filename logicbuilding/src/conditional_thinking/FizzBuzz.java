package conditional_thinking;

import java.util.Optional;

//Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and
//“FizzBuzz” if divisible by both
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        Optional<String> result = Optional.ofNullable(fizzBuzz(number));
        result.ifPresentOrElse(System.out::println,
                ()-> System.out.println(number+" is neither divisible by 3 nor 5"));

    }
    private static String fizzBuzz(int number){
        if(number%3==0 && number%5==0)
            return "FizzBuzz";
        else if(number%3==0)
            return "Fizz";
        else if(number%5==0)
            return "Buzz";
        else
            return null;
    }
}
