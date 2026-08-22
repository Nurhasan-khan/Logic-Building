package queue;

public class LinearQueueUsingLL {
    private Node front;
    private Node rear;
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if (rear == null && front == null){
            rear = newNode;
            front = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int dequeue(){
        if (front == null){
            System.out.println("Queue UnderFlow!!!");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null) rear = null;
        return data;
    }
    public void display(){
        if (front == null) {
            System.out.println("Queue is Empty!!!");
            return;
        }
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
