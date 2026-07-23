package linkedlist;

public class CircularMain {
    public static void main(String[] args) {
        CircularLL linkedList = new CircularLL();
        linkedList.insertFirst(10);
        linkedList.insertLast(20);
        linkedList.insertFirst(5);
        linkedList.insertLast(30);
        linkedList.display();
        System.out.println(linkedList.search(15));
//        linkedList.delete(30);
//        linkedList.display();
//        linkedList.delete(5);
//        linkedList.display();
//        linkedList.delete(10);
//        linkedList.display();
//        linkedList.delete(20);
//        linkedList.display();

    }
}
