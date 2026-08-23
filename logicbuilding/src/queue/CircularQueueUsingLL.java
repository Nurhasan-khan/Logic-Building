package queue;

public class CircularQueueUsingLL {
    private Node front;
    private Node rear;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        // first queue element
        if (rear == null){
            front = newNode;
            rear = newNode;
            newNode.next = front;
        }else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }
    public int dequeue(){
        if (front == null){
            System.out.println("Queue UnderFlow !!");
            return -1;
        }
        int data = front.data;
        // last element
        if(front == rear){
            front = null;
            rear = null;
        }else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }
    public void display(){
        if (front == null){
            System.out.println("queue is empty!!");
            return;
        }
        Node temp = front;
        do{
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }while (temp != front);
        System.out.println("END");
    }
}
