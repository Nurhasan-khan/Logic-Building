package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionII {
    public static void main(String[] args) {
        int []nums1 = {4,9,5};
        int []nums2 = {9,4,9,8,4};
        for (int x : intersectHash(nums1,nums2))
            System.out.print(x+",");
    }
    public static int[] intersect(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<num1.length && j < num2.length){
            if (num1[i] == num2[j]){
                num1[k++] = num1[i];
                i++;
                j++;
            }else if (num1[i] < num2[j])
                i++;
            else
                j++;
        }
        return Arrays.copyOf(num1,k);
    }
    static int[] intersectHash(int[] num1 , int[] num2){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<num1.length; i++){
            map.put(num1[i],map.getOrDefault(num1[i],0)+1);
        }
        int k =0;
        for (int j = 0; j<num2.length; j++){
            if(map.containsKey(num2[j])){
                int common = map.get(num2[j]);
                if(common > 0){
                    num1[k] = num2[j];
                    map.put(num2[j],map.getOrDefault(num2[j],0)-1);
                    k++;
                }
            }
        }
        return Arrays.copyOf(num1,k);
    }
}
