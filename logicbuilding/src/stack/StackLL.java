package stack;

public class StackLL {
    private Node top = null;
    private int size = 0;

    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    public boolean isEmpty(){
        return  top == null;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return top.data;
    }
    public int getSize(){
        return size;
    }
}
