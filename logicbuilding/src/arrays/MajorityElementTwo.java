package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2}));
        System.out.println(mooresAlgo(new int[]{1,1,1,3,3,2,2}));
    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > nums.length/3)
                list.add(entry.getKey());
        }

    return list;
    }
    static List<Integer> mooresAlgo(int[] nums){
        int cnt1 = 0;
        int cnt2 = 0;
        int element1 = -1;
        int element2 = -1;
        for (int value : nums){
            if(cnt1 == 0 && element2 != value){
                cnt1++;
                element1 = value;
            }else if (cnt2 == 0 && value != element1){
                cnt2++;
                element2 = value;
            }else if (element1==value) cnt1++;
            else if (element2 == value) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        List<Integer> answer = new ArrayList<>();
        for (int value : nums){
            if (element1 == value) cnt1++;
            else if (element2 == value) cnt2++;
        }
        if (cnt1 >= (nums.length/3)+1)
            answer.add(element1);
        if (cnt2 >= (nums.length/3)+1)
            answer.add(element2);
        return answer;
    }
}
