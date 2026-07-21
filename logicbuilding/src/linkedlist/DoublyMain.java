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
        System.out.print("Deleting First Node: ");
        System.out.println(doublyLL.deleteFirst() +" current size: "+doublyLL.getSize());
        doublyLL.display();
        System.out.print("Delete Last Node: ");
        System.out.println(doublyLL.deleteLast()+" current size: "+doublyLL.getSize());
        doublyLL.display();
        System.out.print("Deleted Node: ");
        System.out.println(doublyLL.delete(2));
        doublyLL.display();
        System.out.println(doublyLL.delete(3));
        doublyLL.deleteLast();
        doublyLL.deleteLast();
        System.out.println("Only One Left: "+doublyLL.deleteFirst());
        doublyLL.display();
    }
}
