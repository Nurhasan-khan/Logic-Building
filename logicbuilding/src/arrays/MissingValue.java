package arrays;

public class MissingValue {
    public static void main(String[] args) {
        int []arr = {8,2,4,5,3,7,1};
        System.out.println(getMissingValue(arr));
        System.out.println(missingValue(arr));
        System.out.println(optimalMissingVal(arr));
        System.out.println(usingXOR(arr));
    }
    // brute force N^2 complexity
    static int getMissingValue(int []arr){
        for (int i = 1; i<=arr.length+1;i++){
            boolean found = false;
            for (int j = 0; j<arr.length; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }
    static int missingValue(int []arr){
        int n = arr.length+1;
        int []hash = new int[n+1];
        for (int i = 0; i<n-1; i++){
            hash[arr[i]]++;
        }
       
        for (int i = 1; i<n;i++){
            if (hash[i] == 0)
                return i;
        }
        return -1;
    }
    // using sum of n terms
    static int optimalMissingVal(int []arr){
        int n = arr.length+1;
        int sumOfN = n*(n+1)/2;
        int sum = 0;
        for (int ele : arr)
            sum += ele;
        return sumOfN - sum;
    }
    static int usingXOR(int []arr){
        int n = arr.length+1;
        int xor2 = 0, xor1 = 0;
        for (int element : arr)
            xor2 ^= element;
        for (int i = 1; i<=n; i++)
            xor1 ^= i;
        return xor1 ^ xor2;
    }
}
