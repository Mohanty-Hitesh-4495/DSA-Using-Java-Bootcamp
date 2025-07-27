package LinkedList;
// Introduction to Linked List...
// https://takeuforward.org/linked-list/linked-list-introduction

// creating node class of a linked list
class Node{
    int data;   // data
    Node next;  // reference to next node

    // constructor for node with provided reference to next node
    Node(int d, Node n){
        this.data = d;
        this.next = n;
    }

    // constructor for end node
    Node(int d){
        this.data = d;
    }
}

public class IntroToLinkedList {

    public static Node arrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12,2,3,4,5};

        Node head = arrToLL(arr);
        System.out.println(head.data);
    }
}
