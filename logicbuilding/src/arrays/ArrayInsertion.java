package arrays;


public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Enter the size of the array: ");
        int size = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter Elements: ");
        for (int i = 0; i<size; i++){
            arr[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i<size; i++)
            System.out.print(arr[i]+",");
        System.out.println();
//        size = insertAtEnd(arr,size,6);
//        size = insertAtEnd(arr,size,66);
//        size = insertAtSpecificPosition(arr,size,2,2);
        size = insertAtBeginning(arr,size,1);
        size = insertAtBeginning(arr,size,10);
        for (int i = 0; i<size; i++)
            System.out.print(arr[i]+",");

    }
    private static int insertAtEnd(int[] arr,int size, int value){
        if (size >= arr.length){
            System.out.println("Array is Full");
            return size;
        }
        arr[size] = value;
        return size+1;
    }
    private static int insertAtBeginning(int[] arr, int size, int value){
        if(size >= arr.length) return  size;
        for (int i = size-1; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = value;
        return size+1;
    }
    private static int insertAtSpecificPosition(int[] arr , int size, int val, int pos){
        if(pos > size || pos < 0)
            return size;
        for (int i = size-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = val;
        return size+1;
    }

}
