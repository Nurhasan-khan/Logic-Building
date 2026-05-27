package searching.binary;

import java.util.Arrays;

public class MakeBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println(minimumDayToMakeBouquet(bloomDay,m,k));
        System.out.println(minimumDaysOptimal(bloomDay,m,k));
    }
    static int minimumDayToMakeBouquet(int[] bloomDays, int m , int k){
        long totalFlowers = (long) m*k;
        if (totalFlowers > bloomDays.length)
            return -1;
        int min = Arrays.stream(bloomDays).min().getAsInt();
        int max = Arrays.stream(bloomDays).max().getAsInt();
        for (int day = min; day<=max; day++){
            if(isPossible(bloomDays,day,m,k))
                return day;
        }
        return  -1;
    }
    static boolean isPossible(int[] bloomDays, int day , int m , int k){
        int count = 0;
        int bouquets = 0;
        for (int bloomed : bloomDays){
            if (bloomed <= day){
                count++;
                if (count == k){
                    bouquets ++;
                    count = 0;
                }
            }else
                count = 0;
        }
        return bouquets >= m;
    }
    static int minimumDaysOptimal(int[] bloomDay, int m , int k){
        long totalFlowers = (long) m*k;
        if (totalFlowers > bloomDay.length)
            return -1;
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int day : bloomDay){
            minDay = Math.min(minDay,day);
            maxDay = Math.max(maxDay,day);
        }
        int start = minDay;
        int end = maxDay;
        int ans = -1;
        while(start <= end){
            int day = start + (end - start)/2;
            if (isPossible(bloomDay,day,m,k)){
                ans = day;
                end = day -1;
            }else
                start = day + 1;
        }
        return ans;
    }
}
