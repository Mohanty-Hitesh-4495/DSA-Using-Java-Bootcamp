package LinkedList.Questions;

/*
206. Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/description/
Given the head of a singly linked list, reverse the list, and return the reversed list.
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
 */

public class ReverseLinkedList {

    public static Node  InPlaceReverseLinkedList(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        Node head = Node.convertArr2LL(arr);
        System.out.println("Linked List before Reversal: ");
        Node.printLL(head);
        head = InPlaceReverseLinkedList(head);
        System.out.println("Linked List after Reversal: ");
        Node.printLL(head);
    }
}
