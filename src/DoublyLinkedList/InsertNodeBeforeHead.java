package DoublyLinkedList;

public class InsertNodeBeforeHead {
    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        return head;
    }

    public static Node insertNodeBeforeHead (Node head, int item){
        Node newNode = new Node(item);
        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        Node.printDLL(head);

        System.out.println("Doubly Linked List After Inserting before head with value 10:");

        head = insertNodeBeforeHead(head, 10); // Insert a node with value 10 before head
        Node.printDLL(head);
    }
}
