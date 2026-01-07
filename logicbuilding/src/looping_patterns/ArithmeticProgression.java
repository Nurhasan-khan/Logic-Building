package looping_patterns;

import java.util.ArrayList;
import java.util.List;
//Q. Print first n terms of an arithmetic progression (a, d)
public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println("Enter the First Term: ");
        int firstTerm = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the Common Difference: ");
        int commonDiff = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter The Number of terms: ");
        int n = new java.util.Scanner(System.in).nextInt();
        List<Integer> ap = getAP(firstTerm, commonDiff, n);
        System.out.println(ap);
    }
    private static List<Integer> getAP(int a , int d , int n){
        List<Integer> apSeries = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            apSeries.add(a+(i-1)*d);
        }
        return apSeries;
    }
}
