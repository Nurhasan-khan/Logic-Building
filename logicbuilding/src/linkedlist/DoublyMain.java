package linkedlist;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.insertFirst(10);
        doublyLL.insertFirst(20);
        doublyLL.insertFirst(30);
        doublyLL.insertFirst(40);
        doublyLL.insertFirst(50);
        doublyLL.insertLast(5);
        doublyLL.display();
        doublyLL.insertAtIndex(60,2);
        doublyLL.display();
//        doublyLL.displayInReverse();
    }
}
