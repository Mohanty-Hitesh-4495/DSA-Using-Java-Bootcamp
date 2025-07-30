package LinkedList.Questions;
import static LinkedList.Questions.LinkedListCycle_I.*;

// Length of Loop in Linked List
// Problem Statement: Given the head of a linked list, determine the length of a loop present in the linked list; if not present, return 0.

public class LengthOfCycle {

    public static int findLengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                int count=1;
                Node temp = slow.next;
                while(temp != slow){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 0, 4, 5, 6};
        Node head = makeCyclicLL(arr,1);
//        Node head = Node.convertArr2DLL(arr);
        System.out.println("Linked List: ");
        printCyclicLL(head, arr.length+2);
        if(hasCycle(head)) {
            int length = findLengthOfLoop(head);
            System.out.println("Linked List has Cycle of length: "+ length);
        }
        else
            System.out.println("Linked List doesn't have Cycle.");
    }
}
