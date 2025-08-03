package LinkedList.Questions;

public class Node {
    int data;
    Node next;

    Node(){}

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    public static void printLL(Node head){
        if(head == null){
            return;
        }
        while(head.next != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }
}
