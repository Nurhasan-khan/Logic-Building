package queue;

public class CircularQueue {
    private int front;
    private int rear;
    private int[] queue;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;

    public CircularQueue(){
        this(DEFAULT_CAPACITY);
    }
    public CircularQueue(int capacity) {
        front = -1;
        rear = -1;
        queue = new int[capacity];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue OverFlow!!!");
            return;
        }
        if(front == -1) front = 0;
        rear = (rear+1) % queue.length;
        queue[rear] = data;
        size++;
    }

    private boolean isFull() {
        return (rear+1)%queue.length == front;
    }

    public int dequeue(){
        if (front == -1){
            System.out.println("Queue UnderFlow!!!");
            return -1;
        }
        int data = queue[front];
        if (front == rear){
            front = -1;
            rear = -1;
            size--;
        }else {
            front = (front + 1) % queue.length;
            size--;
        }
        return data;
    }
    public void display(){
        if (front == -1){
            System.out.println("Queue is Empty!!");
            return;
        }
        int i = front;
        while (true){
            System.out.print(queue[i]+" ");
            if (i == rear) break;
            i = (i+1) % queue.length;
        }
        System.out.println();
    }
    public int front(){
        return front!= -1 ? queue[front] : -1;
    }
    public int rear(){
        return rear != -1 ? queue[rear] : -1;
    }
    public int getSize(){
        return size;
    }
}
