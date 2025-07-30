package LinkedList.Questions;
import java.util.Stack;

public class CheckPalindromeLL {

    // Bruteforce: Using Stack Data Structure, but takes extra space complexity (O(N))
    public static boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        while(head != null){
            if(head.data != stack.pop())
                return false;
            head = head.next;
        }
        return true;
    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Optimal: O (2* N) The algorithm traverses the linked list twice, dividing it into halves.
    // During the first traversal, it reverses one-half of the list, and during the second traversal, it compares the elements of both halves.
    public static boolean isPalindrome2(Node head) {
        // 1. divide the Linked List into to halves using tortoise and Hares algo
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse the second half of the list
        Node first = head;
        Node second = reverseLL(slow.next);

        // 3. compare each node element from both halves
        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,3,2,1};
        int[] arr2 = new int[]{1,5,3,2,1};
        Node head1 = Node.convertArr2DLL(arr1);
        Node head2 = Node.convertArr2DLL(arr2);

        if(isPalindrome2(head1))
            System.out.println("Is a Palindrome :)");
        else
            System.out.println("Not a Palindrome :(");
    }
}
