package basic.maths.bitmanipulation;
 // Find if kth bit is on or off;
public class BitOnOff {
     public static void main(String[] args) {
         System.out.println(findBit(2,1));
         System.out.println(setIthBit(21,4));
         System.out.println(resetIthBit(7,2));
     }
     public static int findBit(int n , int k){
         int mask = (1 << k - 1);
         return (n & mask) != 0 ? 1 : 0;
     }
     public static int setIthBit(int n , int k){
         int mask = (1 << k-1);
         return (n | mask);
     }
     public static int resetIthBit(int n , int k){
         int mask =  (1 << k-1);
         return (n & (~mask));
     }
}
