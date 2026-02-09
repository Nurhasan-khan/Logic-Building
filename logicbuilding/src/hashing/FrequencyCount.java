package hashing;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int []numbers = new int[n];
        for (int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
//        int []hash = new int[13];
//        for ( int i = 0; i< n; i++){
//            hash[numbers[i]] += 1;
//        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i<n;i++){
            hashMap.put(numbers[i],hashMap.getOrDefault(numbers[i],0)+1);
        }
        System.out.println("Enter no of Queries: ");
        int queries = sc.nextInt();
        int num;
        while (queries-- != 0){
            num = sc.nextInt();
            System.out.println(hashMap.getOrDefault(num,0));
        }
        System.out.println(hashMap);
        sc.close();
    }
}
