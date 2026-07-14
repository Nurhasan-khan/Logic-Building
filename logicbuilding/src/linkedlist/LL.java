package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    public LL(){
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null)
            tail = head;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }
    public void display(){
        Node currentHead = head;
        while(currentHead != null){
            System.out.print(currentHead.value+"->");
            currentHead = currentHead.next;
            if(currentHead == null)
                System.out.print("Null");
        }
    }
}
