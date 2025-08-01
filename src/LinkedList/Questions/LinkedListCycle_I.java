package LinkedList.Questions;
import java.util.HashMap;

/*
141. Linked List Cycle
https://leetcode.com/problems/linked-list-cycle/description/

Given head, the head of a linked list, determine if the linked list has a cycle in it.
    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */

public class LinkedListCycle_I {
    public static Node makeCyclicLL(int[] arr, int pos){
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;
        Node loopNode = null;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;

            if(i == pos){
                loopNode = newNode;
            }
        }
        // if pos is 0, loopNode is head
        if(pos == 0){
            loopNode = head;
        }
        // making the list cyclic
        temp.next = loopNode;

        return head;
    }

    public static void printCyclicLL(Node head, int limit){
        Node temp = head;
        int count = 0;

        while(temp != null && count < limit){
            System.out.print(temp.data + "->");
            temp = temp.next;
            count++;
        }
        System.out.print("...");
        System.out.println();
    }

     // Bruteforce: store each node in HashMap with counter, if any node already exist, that means its already a cyclic LL
     public static boolean hasCycleUsingHashMap(Node head) {
         HashMap<Node, Integer> map = new HashMap<>();
         while(head!=null){
             if(map.containsKey(head)){
                 return true;
             }
             else {
                 map.put(head,1);
                 head = head.next;
             }
         }
         return false;
     }

     // Tortoise and Hare Algorithm: two pointer (slow & fast)
     public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
     }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 0, 4, 5, 6};
        Node head = makeCyclicLL(arr,1);
//        Node head = Node.convertArr2LL(arr);
        System.out.println("Linked List: ");
        printCyclicLL(head, arr.length+2);
        if(hasCycle(head)) {
            System.out.println("Linked List has Cycle.");
        }
        else
            System.out.println("Linked List doesn't have Cycle.");
    }
}
