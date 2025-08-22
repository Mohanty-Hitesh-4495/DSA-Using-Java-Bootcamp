package LinkedList.Questions;
// https://takeuforward.org/plus/dsa/problems/add-one-to-a-number-represented-by-ll

public class AddOneToNumber {

    public static Node reverseLL(Node head){
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

    public static Node addOneToTheNumberRepresentedByLL(Node head){
        // 1. Reverse the linked list
        head = reverseLL(head);
        // 2. Add one with carry
        int carry = 1;
        Node temp = head;
        while(temp != null){
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum/10;

            // If no carry, break early
            if(carry == 0) break;

            // move ahead
            if(temp.next == null && carry > 0){
                temp.next = new Node(carry);
                carry = 0;
            }
            temp = temp.next;
        }
        head = reverseLL(head);
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3}; //123->124
        int[] num = new int[] {9,9}; //99->100

        Node head1 = Node.convertArr2LL(arr);
        Node head2 = Node.convertArr2LL(num);

        System.out.println("Current Linked List:");
        Node.printLL(head1);
        head1 = addOneToTheNumberRepresentedByLL(head1);
        System.out.println("Linked List after adding one:");
        Node.printLL(head1);
        System.out.println("Current Linked List:");
        Node.printLL(head2);
        head2 = addOneToTheNumberRepresentedByLL(head2);
        System.out.println("Linked List after adding one:");
        Node.printLL(head2);

    }
}
