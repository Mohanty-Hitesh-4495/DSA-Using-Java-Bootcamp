package DoublyLinkedList;

public class RemoveDuplicatesFromSortedDLL {
    public static Node removeDuplicates(Node head) {
        if(head == null || head.next == null)
            return head;
        Node temp = head;
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
                if(temp.next != null)
                    temp.next.prev = temp;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,3,3,4,5,5,5,8,8};
        Node head = Node.convertArrToDLL(arr);
        System.out.println("Doubly Linked List before removing Duplicates: ");
        Node.printDLL(head);
        head = removeDuplicates(head);
        System.out.println("Doubly Linked List after removing Duplicates: ");
        System.out.print("DLL from head to tail: ");
        Node.printDLL(head);
        System.out.print("DLL from tail to head: ");
        Node.reversePrintDLL(head);
    }
}
