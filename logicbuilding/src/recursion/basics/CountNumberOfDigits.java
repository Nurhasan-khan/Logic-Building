package recursion.basics;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(numberOfDigits(0,12345));
    }
    static int numberOfDigits(int count, int num){
        if (num == 0){
            return count;
        }
        return numberOfDigits(count += 1,num/10);
    }
}
