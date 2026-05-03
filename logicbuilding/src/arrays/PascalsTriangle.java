package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
//        System.out.println(nCrBrute(6,5));
//        System.out.println(nCrOptimal(4,3));
//        System.out.println(printNthRowBrute(1));
//        System.out.println(printNthRowOptimal(3));
        System.out.println(generate(30));
    }
    static int nCrBrute(int n , int r){
        n = n-1;
        r = r-1;
        int nfactorial = 1;
        for (int i = 0; i<n; i++){
            nfactorial *= n-i;

        }
        int rfactorial = 1;
        for (int i = r; i>0; i--){
            rfactorial *= i;

        }
        int nMinusR  = n-r;
        int nMinusRFact = 1;
        for (int i = nMinusR; i>0; i--){
            nMinusRFact *= i;

        }

        return nfactorial/(rfactorial * nMinusRFact);
    }
    static long nCrOptimal(int r, int c){
//        r = r-1;
//        c = c-1;
        long result = 1;
        for (int i = 0; i<c; i++){
            result *= r-i;
            result /= i+1;

        }
        return result;
    }
    // 0 based indexing for row;
    static List<Integer> printNthRowBrute(int row){
        List<Integer> list = new ArrayList<>();
        for (int c = 0; c<=row; c++){
            list.add((int) nCrOptimal(row,c));
        }
            return list;
    }
    static List<Integer> printNthRowOptimal(int row){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long ans = 1;
        for (int i = 1; i<=row; i++){
            ans = ans * (row+1-i);
            ans = ans / i;
            list.add((int) ans);
        }
        return list;
    }
    static List<List<Integer>> generate(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i<n; i++){
            triangle.add(printNthRowOptimal(i));
        }
        return triangle;
    }
}
