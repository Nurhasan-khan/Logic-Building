package searching.binary;

import java.util.Arrays;

public class CapacityToShip {
    public static void main(String[] args) {
        int[] weights = {5,4,5,2,3,4,5,6};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
        System.out.println(optimalShipWithinDays(weights,days));
    }
    static int dayNeeded(int[] weights, int capacity){
        int days = 1;
        int currentLoad = 0;
        for (int w : weights){
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            }else
                currentLoad += w;

        }
        return days;
    }
    static int shipWithinDays(int[] weights, int days){
        int maxElement = Arrays.stream(weights).max().getAsInt();
        int maxCapacity = Arrays.stream(weights).sum();
        for (int minCapacity = maxElement; minCapacity<=maxCapacity; minCapacity++){
            int needed = dayNeeded(weights,minCapacity);
            if (needed <=days)
                return minCapacity;
        }
        return maxCapacity;
    }
    static int optimalShipWithinDays(int[] weights, int days){
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        int minCap = 0;
        while (left<=right){
            int mid = left + (right - left) / 2;
            int needed = dayNeeded(weights,mid);
            if (needed <= days) {
                minCap = mid;
                right = mid - 1;
            }else
                left = mid + 1;
        }
        return minCap;
    }
}
