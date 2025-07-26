package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem Title: Sum of K Largest Elements
Statement: Given an array of n integers and an integer k, compute the sum of the k largest elements in the array.

Input Format:
First line: An integer n (size of array)
Next n lines: Array elements
Last line: An integer k (number of largest elements to sum)

Output Format:
A single line displaying: Sum = <sum_of_k_largest_elements>

Example Input:
6
5 1 9 3 7 2
3

Example Output:
Sum = 21

Explanation:
The three largest elements are 9, 7, 5. Their sum is 21.
*/

public class SumOfKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int sum=0;
        for(int i=n-1; i>(n-k-1); i--){
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
