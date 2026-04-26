package sorting;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println("Before Sorting: ");
        for (int v : arr)
            System.out.print(v+" ");
        System.out.println("\nAfter Sorting: ");
        cyclicSort(arr);
        for (int v : arr)
            System.out.print(v+" ");
    }
    private static void cyclicSort(int[] arr){
        int ind = 0;
        while (ind<arr.length){
            int correctIndex = arr[ind]-1;
            if(arr[ind] != arr[correctIndex]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[ind];
                arr[ind] = temp;
            }else{
                ind++;
            }
        }
    }
}
