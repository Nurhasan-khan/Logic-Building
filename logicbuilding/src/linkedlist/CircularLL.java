package linkedlist;

public class CircularLL {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = this;
        }
    }
    public void insertLast(int data){
        if (tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node.next = head;
        tail  = node;
        size++;
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next;
        do {
            System.out.print(current.data+" -> ");
            current = current.next;
        }while (current != head);
        System.out.println("HEAD");
    }
    public void delete(int val){
        if (head == null)
            return;
        // single node
         if (head ==  tail && head.data == val){
             head = null;
             tail = null;
             size--;
             return;
         }
        Node current = head;
        // delete head node
        if(current.data == val){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do{
            Node n = current.next;
            if(n.data == val) {
                current.next = n.next;
                if (n == tail) {
                    tail = current;
                }
                size--;
                break;
            }

            current = current.next;
        }while (current!=head);
    }
    public boolean search(int val){
        Node current = head;
        do{
            if(current.data == val)
                return true;
            current = current.next;
        }while (current != head);
        return false;
    }

    public int getSize() {
        return size;
    }
}
