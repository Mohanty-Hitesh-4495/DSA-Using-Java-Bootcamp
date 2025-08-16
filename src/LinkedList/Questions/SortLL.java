package LinkedList.Questions;
import java.util.Arrays;

/*
148. Sort List
https://leetcode.com/problems/sort-list/description/

Given the head of a linked list, return the list after sorting it in ascending order.
Input: head = [4,2,1,3]
Output: [1,2,3,4]
*/

public class SortLL {

    // A naive solution could be converting the linked list into an array, sorting the array,
    // and then creating a new linked list from the sorted array's values.
    public static Node naiveSortLL(Node head){
        int n = Node.getSize(head);
        int[] arr = new int[n];
        Node temp = head;
        for(int i=0; i<n; i++){
            arr[i] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int i=0; i<n; i++){
            temp.data = arr[i];
            temp =temp.next;
        }
        return head;
    }

    public static Node mergeSort(Node left, Node right){
        if (left == null) return right;
        if (right == null) return left;

        Node dummy = new Node(-1);
        Node temp = dummy;
        while( left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if(left != null){
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }

    // Function to find the middle of a linked list
    public static Node FindMiddleNode(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null)
            prev.next = null;
        return slow;
    }

    // Divides the linked list into smaller parts until they become trivial to sort (single node or empty list).
    // Merges and sorts the divided parts while combining them back together.
    public static Node optimalSortLL(Node head){
        if(head == null || head.next == null)
            return head;

        Node middle = FindMiddleNode(head);

        Node left = optimalSortLL(head);
        Node right = optimalSortLL(middle);

        return mergeSort(left,right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,8,2,7,1};
        Node head = Node.convertArr2LL(arr);
        System.out.println("Linked List before sorting: ");
        Node.printLL(head);
        head = optimalSortLL(head);
        System.out.println("Linked List after sorting: ");
        Node.printLL(head);
    }
}
