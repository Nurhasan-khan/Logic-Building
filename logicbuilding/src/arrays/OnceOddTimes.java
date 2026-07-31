package arrays;


//Same as Leetcode - Single Number Two
// all no appear odd times (3,5,7,....) except one
public class OnceOddTimes {
    public static void main(String[] args) {
        int []arr = {2,2,121,2,7,7,8,7,8,8,};
        System.out.println(find(arr,3));
    }
    static int find(int[] arr, int times){
       int result = 0;
       for (int i  = 0; i<32; i++){
           int count = 0;
           for (int num : arr){
               if ( ((num >> i)&1) == 1)
                   count++;
           }
           if (count % 3 != 0)
               result |= (1<<i);

       }
       return result;
    }
}
