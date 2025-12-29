package looping_patterns;
//Q. Count the number of digits in a given number
public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int length = 0, temp = number ;
        if (number == 0)
            length = 1;
        else {
            while (number != 0) {
                number /= 10;
                length += 1;
            }
        }
        System.out.println("There are "+length+" digits in "+temp);
    }
}
