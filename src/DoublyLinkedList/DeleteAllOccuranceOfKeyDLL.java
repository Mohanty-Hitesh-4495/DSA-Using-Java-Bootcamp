package DoublyLinkedList;

/*
https://takeuforward.org/plus/dsa/problems/delete-all-occurrences-of-a-key-in-dll
Given the head of a doubly linked list and an integer target. Delete all nodes in the linked list with the value target and return the head of the modified linked list.
Example:
    Input: head -> 1 <-> 2 <-> 3 <-> 1 <-> 4, target = 1
    Output: head -> 2 <-> 3 <-> 4
    Explanation: All nodes with the value 1 were removed.
*/

public class DeleteAllOccuranceOfKeyDLL {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,1,8,2};
        Node head = Node.convertArrToDLL(arr);
        System.out.println("Doubly Linked List before Deletion:");
        Node.printDLL(head);
        head = deleteAllOccurrences(head,2);
        System.out.println("Doubly Linked List after Deletion:");
        Node.printDLL(head);
    }
    public static Node deleteAllOccurrences(Node head, int target) {
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                if(temp == head){
                    head=head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    if(temp.prev != null){
                        temp.prev.next = temp.next;
                    }
                    if(temp.next != null){
                        temp.next.prev = temp.prev;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
