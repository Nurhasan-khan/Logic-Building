package stack;

public class CustomStack {
    protected int top;
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;


    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public  CustomStack(int size){
        top = -1;
        arr = new int[size];
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] =  value;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!!!");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[top];
    }

    public  boolean isFull(){
        return top == arr.length-1;
    }
    public  boolean isEmpty(){
        return top == -1;
    }

}
