package Problem_Solving;
import java.util.Scanner;

/*
Remove Duplicates from Sorted List:
You are given head of the non-empty sorted linked list where the value of the ith node will be Ai.
Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.
*/

public class RemoveDuplicatesInLL {

    public static void removeDuplicates(ListNode head){
        ListNode temp = head;
        while(temp!=null && temp.next != null){
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ListNode head = ListNode.convertArrayToLL(arr);
        System.out.println("Given Linked List:");
        ListNode.printLL(head);
        removeDuplicates(head);
        System.out.println("Linked List after removing duplicates:");
        ListNode.printLL(head);
    }
}
