package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;
/*
 Given an array arr[] and an integer k, the task is to find k largest
 elements in the given array. Elements in the output array should be in
 decreasing order.
 Examples:
 Input: [1, 23, 12, 9, 30, 2, 50], k = 3
 Output: [50, 30, 23]
 Input: [11, 5, 12, 9, 44, 17, 2], k = 2
 Output: [44, 17]
 */
public class KLargestElements {

    public static int[] KElements(int[] arr, int k){
        int[] ans = new int[k];
        Arrays.sort(arr);
        int n = arr.length, index = 0;
        for(int i=n-1; i>n-k-1; i--){
            ans[index++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements in Array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the K :");
        int k = sc.nextInt();
        System.out.println("Given Array: "+ Arrays.toString(arr));
        System.out.println("K Largest Elements: "+ Arrays.toString(KElements(arr,k)));
    }
}
