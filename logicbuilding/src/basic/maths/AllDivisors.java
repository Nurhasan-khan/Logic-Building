package basic.maths;

import java.util.ArrayList;
import java.util.List;

public class AllDivisors {
    public static void main(String[] args) {
        System.out.println(getAllDivisors(36));
    }
//    static void getAllDivisors(int n){
//        for (int i = 1; i<=n; i++){
//            if (n%i == 0)
//                System.out.print(i+",");
//        }
//    }

    static List<Integer> getAllDivisors(int n){
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                factors.add(i);
                if (n / i != i)
                   factors.add(n/i);
            }
        }
        factors.sort(Integer::compareTo);
        return factors;
    }
}
