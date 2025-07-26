package Problem_Solving;
// Set-A
// Implementing a stack using a Linked List :)
// Very EASY QUESTION :)

class Node {
    int data;
    Node next;
    Node prev;

    public Node (){
        this.data = -1;
        this.next = null;
        this.prev = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Stack {

    // this function will return the size of stack...
    public static int getSize(Node head){
        int length = 0;
        if (head.data == -1 && head.next == null)
            head = head.next; // ignore the dummy node
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }

    // this function will check whether stack is empty or not?
    public static boolean isEmpty(Node head){
        return head == null;
    }

    // this function will return the top element of the stack :)
    public static int top(Node head){
        if (head == null) return -1; // stack underflow
        int top = 0;
        while( head.next != null){
            head = head.next;
        }
        top = head.data;
        return top;
    }

    // this method will push new element into the stack, by creating new node in a linked list :)
    public static void push (int item, Node head){
        int length = getSize(head);
        if(length == 10) {
            System.out.println("Stack Overflow :( \n plij make some more space.");
            return;
        }
        while(head.next != null){
            head = head.next;
        }

        Node temp = new Node(item);
        temp.prev = head;
        head.next = temp;
    }

    // this function will remove last element of the stack :)
    public static void pop (Node head){
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        while(head.next != null){
            head = head.next;
        }
        head.prev.next = null;
        head.prev = null;
    }
}

public class StackInLinkedList {
    public static void main(String[] args) {
        Node head = new Node();
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.push(5,head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.push(6,head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.push(7,head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.pop(head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.pop(head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
        Stack.pop(head);
        System.out.println(Stack.top(head) +" "+ Stack.isEmpty(head) +" "+ Stack.getSize(head));
    }
}
