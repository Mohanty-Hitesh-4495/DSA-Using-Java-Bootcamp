package LinkedList.Questions;

/*
19. Remove Nth Node From End of List
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
Example 2:
    Input: head = [1], n = 1
    Output: []
Example 3:
    Input: head = [1,2], n = 1
    Output: [1]
 */

public class RemoveNthNode {

    // Optimal Approach
    public static Node removeNthNode(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        if(fast == null) {
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Bruteforce Approach
    public static Node removeNthNode1(Node head, int n){
        int l = 0;
        Node temp = head;
        // finding length of linked list...
        while(temp != null){
            l++;
            temp = temp.next;
        }
        // if nth node is equal to length, means remove head node...
        if(l == n) {
            Node newNode = head.next;
            head = null;
            return newNode;
        }
        // traverse till (n+1)th node from the end of Linked list...
        temp = head;
        int res = l - n;
        for(int i=0; i<res; i++){
            temp = temp.next;
        }
        // removing the node...
        Node delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15,25,14,18,68};
        Node head = Node.convertArr2LL(arr);

        System.out.println("Linked List before removal of Nth Node:");
        Node.printLL(head);

        head = removeNthNode1(head, 5);

        System.out.println("Linked List after removal of Nth Node: ");
        Node.printLL(head);
    }
}
