package LinkedList.Questions;
import java.util.HashSet;

/*
Notes: https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
Leetcode Problem: https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

public class IntersectionOfTwoLL {

    // utility function to insert node at the end of the linked list
    static Node insertNode(Node head,int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    //utility function to print linked list created
    static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }
    // Optimal Approach: utility function to check presence of intersection
    public static Node intersectionPresent(Node headA, Node headB){
        Node d1 = headA;
        Node d2 = headB;
        while(d1 != d2){
            d1 = d1==null ? headB : d1.next;
            d2 = d2==null ? headA : d2.next;
        }
        return d1;
    }

    // Bruteforce Approach: utility function for checking presence of intersection
    public static Node intersectionPresent1(Node headA, Node headB){
         while(headA != null){
             Node temp = headB;
             while(temp != null){
                 if(headA == temp) return headA;
                 temp = temp.next;
             }
             headA = headA.next;
         }
         return null;
    }

    // Better Approach:
    public static Node intersectionPresent2(Node headA, Node headB){
         HashSet<Node> hashSet = new HashSet<>();
         while(headA != null){
             hashSet.add(headA);
             headA = headA.next;
         }
         while(headB != null){
             if(hashSet.contains(headB))
                 return headB;
             headB = headB.next;
         }
         return null;
    }

    // more optimised than better
    public static Node intersectionPresent3(Node headA, Node headB){
         int lenA = 0;
         int lenB = 0;
         Node tempA = headA;
         Node tempB = headB;
         while(tempA != null){
             lenA++;
             tempA = tempA.next;
         }
         while(tempB != null){
             lenB++;
             tempB = tempB.next;
         }
         int diff = lenA-lenB;
         if(diff < 0){
             while(diff++ != 0){
                 headB = headB.next;
             }
         } else {
             while(diff-- != 0){
                 headA = headA.next;
             }
         }
         while(headA != null){
             if(headA == headB) return headA;
             headA = headA.next;
             headB = headB.next;
         }
         return null;
    }

    public static void main(String[] args) {
        // creation of both lists
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec=insertNode(headSec,3);
        Node head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);
        //checking if intersection is present
        Node answerNode = intersectionPresent(head1,head2);
        if(answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerNode.data);
    }
}
