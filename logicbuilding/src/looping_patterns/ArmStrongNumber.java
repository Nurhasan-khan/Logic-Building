package looping_patterns;
//Q. Check if a number is an ArmStrongNumber
public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int sum = 0, digit , originalNumber = number;
        int length = getLength(number);
        while(number!=0){
            digit = number % 10;
            sum = (int) (sum + Math.pow(digit,length));
            number /= 10;
        }
        if(sum == originalNumber)
            System.out.println(originalNumber+" is an armStrong number.");
        else
            System.out.println(originalNumber+" is not an armStrong number.");
    }
    private static int getLength(int number){
        int count = 0;
        if(number == 0)
            count = 1;
        else{
            while (number != 0){
                number /= 10;
                count += 1;
            }
        }
        return count;
    }
}
