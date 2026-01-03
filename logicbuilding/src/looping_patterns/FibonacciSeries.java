package looping_patterns;
//Q. Print Fibonacci series up to n terms.
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the nth Term: ");
        int nThTerm = new java.util.Scanner(System.in).nextInt();
        int firstPrevious = 0 , secondPrevious = 1, temp ;
        System.out.print(firstPrevious+","+ secondPrevious+",");
        for (int i = 2; i <nThTerm; i++){
            temp = secondPrevious;
            secondPrevious = firstPrevious + secondPrevious;
            firstPrevious = temp;
            System.out.print(secondPrevious+",");
        }
    }
}
