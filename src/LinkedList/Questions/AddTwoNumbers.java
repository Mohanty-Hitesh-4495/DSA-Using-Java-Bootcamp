package LinkedList.Questions;
/*
2. Add Two Numbers
https://leetcode.com/problems/add-two-numbers/

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static Node addTwoNumbers(Node head1, Node head2){
        Node dummyNode = new Node();
        Node temp = dummyNode;

        int carry = 0;
        while(head1 != null || head2 != null || carry==1){
            int sum = 0;
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }
            sum += carry;
            carry = sum/10;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,3};
        int[] arr2 = new int[]{5,6,4};

        Node head1 = Node.convertArr2LL(arr1);
        Node head2 = Node.convertArr2LL(arr2);
        System.out.print("LL 1: "); Node.printLL(head1);
        System.out.print("LL 2: "); Node.printLL(head2);
        Node ans = addTwoNumbers(head1, head2);
        System.out.print("Linked List after adding two numbers: "); Node.printLL(ans);
    }
}
