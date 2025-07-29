package LinkedList.Questions;
import static LinkedList.Questions.LinkedListCycle_I.*;

/*
142. Linked List Cycle II
https://leetcode.com/problems/linked-list-cycle-ii/description/
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
    Input: head = [3,2,0,-4], pos = 1
    Output: tail connects to node index 1
    Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */

public class LinkedListCycle_II {

    public static Node cycleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 0, 4, 5, 6};
//        Node head = makeCyclicLL(arr,1);
        Node head = Node.convertArr2DLL(arr);
        System.out.println("Linked List: ");
        printCyclicLL(head, arr.length+2);
        if(hasCycle(head)) {
            Node cycleNode = cycleNode(head);
            System.out.println("Linked List has Cycle starting from: "+ cycleNode.data);
        }
        else
            System.out.println("Linked List doesn't have Cycle.");
    }
}
