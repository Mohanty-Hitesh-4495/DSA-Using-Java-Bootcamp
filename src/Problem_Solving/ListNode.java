package Problem_Solving;

public class ListNode {
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public static ListNode convertArrayToLL(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i=1; i<arr.length; i++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(ListNode head){
        while(head.next != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

}
