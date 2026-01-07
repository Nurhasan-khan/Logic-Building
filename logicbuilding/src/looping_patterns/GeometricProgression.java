package looping_patterns;

import java.util.ArrayList;
import java.util.List;
//Q. Print first n terms of a geometric progression (a, r)
public class GeometricProgression {
    public static void main(String[] args) {
        System.out.println("Enter the First term: ");
        int firstTerm = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the common ration: ");
        int commonRatio = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the Number of Terms: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(getGP(firstTerm,commonRatio,n));

    }
    private static List<Integer> getGP(int a , int r , int n){
        List<Integer> gpSeries = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            gpSeries.add(a*(int)Math.pow(r,i-1));
        }
        return gpSeries;
    }
}
