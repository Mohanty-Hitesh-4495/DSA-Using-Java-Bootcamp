package DoublyLinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data, Node previous, Node next){
        this.data = data;
        this.prev = previous;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Function to print Doubly Linked List from head to end
    public static void printDLL(Node head){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

    // function to convert array to doubly linked list..
    public static Node convertArrToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        return head;
    }
}

public class IntroToDLL {
    public static void main(String[] args) {
        int[] item = new int[] {1,2,3,4,5};
        Node head = new Node(item[0]);
        Node temp = head;
        for(int i=1; i<item.length; i++){
            Node newNode = new Node(item[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        System.out.println("Printing Doubly Linked List:");
        Node.printDLL(head);

    }
}
