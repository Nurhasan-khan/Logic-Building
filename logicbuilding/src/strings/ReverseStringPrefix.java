package strings;

public class ReverseStringPrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcd",2));
    }
    public static  String reversePrefix(String s, int k) {
            char[] arr = s.toCharArray();
            int left = 0;
            int right = k -1;
            while (left <= right){
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] =  c;
                left++;
                right--;
            }
      return new String(arr);
    }
}
