package linkedlist;

public class CreatingLinkedList {

    public static void main(String[] args) {
       LL linkedList = new LL();
       linkedList.insertFirst(100);
       linkedList.insertLast(200);
       linkedList.insertLast(300);
       linkedList.insertFirst(400);
       linkedList.display();
    }
}
