package looping_patterns;
//Q. Print the reverse of a given number

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int reverse=0,digit, temp = number;
        while (number != 0){
            digit = number%10;
            reverse = reverse*10+digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
