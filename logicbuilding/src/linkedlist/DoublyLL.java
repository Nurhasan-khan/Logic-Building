package linkedlist;

import java.util.NoSuchElementException;

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
    public int deleteFirst() throws NoSuchElementException{
        if (head == null) throw new NoSuchElementException("List is Empty!!!");
        int data = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        size--;
        return data;
    }
    public int deleteLast() throws NoSuchElementException{
        if (tail == null) throw new NoSuchElementException("List is Empty!!!");
        if (head == tail) return deleteFirst();
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;
    }
    public int delete(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > size-1) throw new IndexOutOfBoundsException("Invalid Index value!!!");
        if(index == 0) return deleteFirst();
        if (index == size-1) return deleteLast();
        Node prevNode = getPrev(index);
        int data = prevNode.next.data;
        prevNode.next = prevNode.next.next;
        prevNode.next.prev = prevNode;
        size--;
        return data;
    }
    public int getSize(){
        return size;
    }
    private Node getPrev(int index){
        Node node = head;
        for (int i = 1; i<index; i++){
            node = node.next;
        }
        return node;
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
