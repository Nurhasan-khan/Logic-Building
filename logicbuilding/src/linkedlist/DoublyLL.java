package linkedlist;

public class DoublyLL {
   private Node head;
   private Node tail;
   private int size;
    private class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(int data, Node prev , Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public Node(Node prev, int data) {
            this.prev = prev;
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        if (head != null)
            head.prev = node;
        head = node;
        if (tail == null)
            tail = head;
        size++;
    }
    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insertAtIndex(int val , int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        node.prev = temp;
        size++;
    }
    public int getSize(){
        return size;
    }
    public void display(){
        Node temp = head;
        while (temp!= null){
            if(temp.prev == null)
                System.out.print("null");
            System.out.print(" <- "+temp.data +" -> ");
            if (temp.next == null)
                System.out.println("null");
            temp = temp.next;
        }
    }
    public void displayInReverse(){
        Node temp = tail;
        while (temp!= null){
            if(temp.next == null)
                System.out.print("null");
            System.out.print(" <- "+temp.data +" -> ");
            if (temp.prev == null)
                System.out.println("null");
            temp = temp.prev;
        }
    }
}
