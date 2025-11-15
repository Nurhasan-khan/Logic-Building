package conditional_thinking;

import java.util.function.Supplier;

//Take three numbers and print the median value (neither maximum nor minimum)
public class MedianValue {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        int num1 = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();
        int num3 = new java.util.Scanner(System.in).nextInt();
        Supplier<Integer> medianSupplier = () ->{
            int min = Math.min(num1,Math.min(num2,num3));
            int max = Math.max(num1,Math.max(num2,num3));
            return (num1+num2+num3) - (min+max);
        };
        System.out.println("The median value is: "+getMedian(num1,num2,num3));
        System.out.println("The median value is: "+medianSupplier.get());
    }
    private static int getMedian(int num1,int num2, int num3){
        if((num1>=num2 && num1<=num3) || (num1<=num2 && num1>=num3))
            return num1;
        else if((num2>=num1 && num2<=num3) || (num2<=num1 && num2>=num3))
            return num2;
        else
            return num3;
    }
}
