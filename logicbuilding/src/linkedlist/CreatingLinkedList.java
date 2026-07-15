package linkedlist;

public class CreatingLinkedList {

    public static void main(String[] args) throws Exception {
       LL linkedList = new LL();
       linkedList.insertFirst(100);
       linkedList.insertLast(200);
       linkedList.insertLast(300);
       linkedList.insertFirst(400);
       linkedList.insertAtIndex(500,0);
       linkedList.display();
        System.out.println("Current Size: "+linkedList.getSize());
//        System.out.println(linkedList.deleteFirst());
        System.out.println("Removed: "+ linkedList.deleteLast());
        linkedList.display();
        System.out.println("Removed: "+linkedList.delete(3));
        linkedList.display();
        System.out.println(linkedList.find(50));



    }
}
