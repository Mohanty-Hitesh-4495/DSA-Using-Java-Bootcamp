package LinkedList.Questions;


public class FindMiddleNode {

    public static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while ( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printLL(Node head){
        while (head != null){
            System.out.print(head.data);
            head = head.next;
            if(head != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Given LinkedList :");
        printLL(head);
        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
