package searching.binary;

import java.util.Arrays;
import java.util.OptionalInt;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles  = {805306368,805306368,805306368};
        int hour = 1000000000;
        System.out.println(getMinEatingSpeed(piles,hour));
        System.out.println(minEatingSpeed(piles,hour));
    }
    // brute force
    static int getMinEatingSpeed(int[] piles, int hour){
        int max = Arrays.stream(piles).max().stream().max().getAsInt();
        for (int i = 1; i<max; i++){
            long requiredTme = calculateTime( piles, i);
            if (requiredTme <= hour)
                return i;
        }
        return max;
    }
    static long calculateTime(int[] piles, long hourly){
        long totalTime = 0;
        for (int i = 0; i<piles.length; i++){
            totalTime += (long) Math.ceil((double) piles[i] /hourly);
        }
        return totalTime;
    }
//
    static int minEatingSpeed(int[] piles, int hour){
       int ans = Arrays.stream(piles).max().getAsInt();
       int start = 1;
       int end = ans;
       while(start<=end){
           int mid = start + (end - start)/2;
           long requiredTime = calculateTime(piles,mid);
           if (requiredTime <= hour){
               ans = mid;
               end = mid -1;
           }else
               start = mid + 1;
       }
       return ans;
    }
}
