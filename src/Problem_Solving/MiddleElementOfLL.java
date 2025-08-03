package Problem_Solving;
import java.util.Scanner;

/*
Find Middle Element of Linked List:
You are given the head of a singly linked list A of length N. The values
in the list are A1,A2,…,AN respectively. You need to find the value of
the middle element of the linked list.

The middle element of a linked list of length N is the (⌊2N⌋+1)-th
element from the head of the list.

Input Format
 • The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.
 • The first line of each test case contains a single integer N.
 • The second line of each test case contains N space-separated integers A1,A2,…,AN
Output Format
 • For each test case, the function you complete should return the value of the middle element of the list.
 Note: You need to complete the function getMiddleElement to solve the problem.
Input          Output
 3          (mid-element)
 5
 1 2 3 4 5   ->  3
 6
 1 2 3 4 5 6 ->  4
 4
 10 1 6 12   ->  6
 */

public class MiddleElementOfLL {

    public static int middleNodeValue(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int len = sc.nextInt();
            int[] arr =  new int[len];
            for(int j=0; j<len; j++){
                arr[j] = sc.nextInt();
            }
            ListNode head = ListNode.convertArrayToLL(arr);
            System.out.println(middleNodeValue(head));
        }
    }

}
