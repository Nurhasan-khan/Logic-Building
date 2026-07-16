package arrays;

import java.util.ArrayList;
import java.util.List;

class KidWithMaxCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = Integer.MIN_VALUE;
        for (int i : candies){
            if (i > maxCandy)
                maxCandy = i;
        }

        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies){
            ans.add(candy+extraCandies >= maxCandy);
        }
        return ans;
    }
}