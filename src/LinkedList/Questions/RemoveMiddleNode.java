package LinkedList.Questions;

import DoublyLinkedList.DeleteHeadOfDLL;

public class RemoveMiddleNode {

    public static Node DeleteMiddleNode(Node head){
        if(head == null || head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        Node head = Node.convertArr2LL(arr);

        System.out.println("Linked List before deleting middle node: ");
        Node.printLL(head);

        head = DeleteMiddleNode(head);

        System.out.println("Linked List after deleting middle node: ");
        Node.printLL(head);
    }
}
