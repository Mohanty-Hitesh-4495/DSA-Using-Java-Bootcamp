package DoublyLinkedList;
import java.util.*;

public class FindPairsWithGivenSum {

    public static List<List<Integer>> findPairsWithGivenSum(Node head, int target){
        List<List<Integer>> matrix = new ArrayList<>();

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        while(head != null && tail != null && tail != head && tail.next != head){
            int sum = head.data + tail.data;
            if(sum == target){
                matrix.add(Arrays.asList(head.data, tail.data));
                head = head.next;
                tail = tail.prev;
            } else if (sum < target) {
                head = head.next;
            } else {
                tail = tail.prev;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        Node head = Node.convertArrToDLL(arr);
        System.out.println("Given Doubly Linked List: ");
        Node.printDLL(head);

        int target = 7;
        List<List<Integer>> matrix = new ArrayList<>();
        matrix = findPairsWithGivenSum(head, target);
        System.out.println("Pairs values that gives target: ");
        System.out.println(matrix);
    }
}
