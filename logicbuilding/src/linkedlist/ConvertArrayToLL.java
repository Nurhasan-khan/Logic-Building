package linkedlist;

public class ConvertArrayToLL {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8};
        Node head = convert(arr);
        display(head);
    }
    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i<arr.length; i++){
            Node node = new Node(arr[i]);
            mover.next  = node;
            mover = node;
        }
        return head;
    }
    public static void display(Node head){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("END");
    }
}

class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
}