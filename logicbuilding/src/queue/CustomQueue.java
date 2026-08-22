package queue;

public class CustomQueue {
    private int front;
    private int rear;
    private int []arr;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        front = -1;
        rear = -1;
        arr = new int[size];
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1) front = 0;
        arr[++rear] = data;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        front++;
        return data;
    }
    public void display(){
        for (int i = front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public boolean isEmpty(){
        return front == -1 || front > rear;
    }
    public boolean isFull(){
        return rear == arr.length -1;
    }
    public int front(){
         if(isEmpty()) return  -1;
        return arr[front];
    }
}
