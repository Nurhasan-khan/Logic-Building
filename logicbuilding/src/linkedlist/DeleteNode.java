package linkedlist;

/**
 * ere is a singly-linked list head and we want to delete a node node in it.
 *
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 *
 * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
 *
 * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 *
 * The value of the given node should not exist in the linked list.
 * The number of nodes in the linked list should decrease by one.
 * All the values before node should be in the same order.
 * All the values after node should be in the same order.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class DeleteNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        node1.next = node2;
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        diplay(node1);
        // delete second node
        delete(node2);
        diplay(node1);
    }
    // given node should not be == last node
    static void delete (ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    static  void diplay(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
            if(temp == null)
                System.out.println("null");
        }
    }
}
