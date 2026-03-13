package arrays;

import java.util.TreeMap;

public class OnceTwice {
    public static void main(String[] args) {
        int []arr = {1,1,2,3,3,4,4,};
        System.out.println(bruteForce(arr));
        System.out.println(hashingMethod(arr));
        System.out.println(usingXOR(arr));
    }

    static int bruteForce(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            int num = arr[i];
            int count = 0;
            for (int j = 0; j< arr.length; j++){
                if (arr[j] == num )
                    count++;
            }
            if (count == 1)
                return num;
        }
        return 0;
    }
    // better approach
    static int hashingMethod(int[] arr){
        TreeMap<Integer,Integer> hash = new TreeMap<>();
        for (int j : arr) {
            hash.put(j, hash.getOrDefault(j, 0) + 1);
        }
        for (int key : hash.keySet()){
            if (hash.get(key) == 1)
                return key;
        }
        return 0;
    }
    static int usingXOR(int []arr){
        int xor = 0;
        for (int num : arr)
            xor ^= num;
        return xor;
    }
}
