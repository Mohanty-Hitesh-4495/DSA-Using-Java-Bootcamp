package LinkedList.Questions;
import java.util.ArrayList;

/*
328. Odd Even Linked List
https://leetcode.com/problems/odd-even-linked-list/description/

Example1:
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

Example2:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
 */

public class OddEvenLinkedList {

    // Optimal: In-place segregation, separate the odd and even indexed nodes during traversal, then connects the end of the odd list to the head of the even list.
    public static void oddEvenList2(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null){
            odd.next = odd.next.next;    // odd.next = even.next;
            odd = odd.next;
            even.next = even.next.next;  // even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    }

    // Bruteforce: segregating odd and even indexed nodes in a singly linked list by collecting data in an ArrayList and reassigning values back to the original nodes.
    public static Node oddEvenList1(Node head){
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head; // collecting odd indexed node
        while(temp != null){
            list.add(temp.data);
            temp = (temp.next != null) ? temp.next.next : null;
        }

        temp = head.next; // collecting even indexed nodes
        while(temp != null){
            list.add(temp.data);
            temp = (temp.next != null) ? temp.next.next : null;
        }

        temp = head; int i=0;
        while(temp != null && i<list.size() ) {
            temp.data = list.get(i++);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,1,3,5,6,4,7};
        Node head = Node.convertArr2LL(arr);

        System.out.println("Given Linked List: ");
        Node.printLL(head);

        head = oddEvenList1(head);

        System.out.println("Segregated Linked List:");
        Node.printLL(head);
    }


}
