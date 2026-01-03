package looping_patterns;
//Q. Print sum of first n terms of Fibonacci series
public class SumOfFibonacci {
    public static void main(String[] args) {
        System.out.println("Enter nTh Term: ");
        int nThTerm = new java.util.Scanner(System.in).nextInt();
        int firstPrevious = 0, secondPrevious = 1, temp, sum = firstPrevious + secondPrevious;
        for (int i = 2; i<nThTerm; i++){
            temp = secondPrevious;
            secondPrevious = firstPrevious + secondPrevious;
            firstPrevious = temp;
            sum += secondPrevious;
        }
        System.out.println("Sum of first "+nThTerm +" is: "+sum);
    }
}
