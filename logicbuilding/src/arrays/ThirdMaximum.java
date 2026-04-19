package arrays;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(thirdLargest(arr));
    }
    public static int thirdLargest(int[] arr){
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer num : arr){
            if(num.equals(max1) || num.equals(max2) || num.equals(max3))
                continue;
            else if (max1 == null || num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if (max2 == null || num > max2){
                max3 = max2;
                max2 = num;
            }else if (max3 == null || num > max3)
                max3 = num;
        }
        return max3==null ? max1 : max3;
    }
}
