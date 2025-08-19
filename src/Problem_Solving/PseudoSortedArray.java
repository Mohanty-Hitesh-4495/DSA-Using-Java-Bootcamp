package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement: Pseudo Sorted Array

An array A of length N is said to be pseudo-sorted if it can be made non-decreasing after performing the following operation at most once.
Given an array A, determine if it is pseudo-sorted or not.

Input Format:
    1. The first line contains a single integer T(no.of experimentations) - the number of test cases. Then the test cases follow.
        a. The first line of each test case contains an integer N - the size of the array A.
        b. The second line of each test case contains N space-separated integers A[1], A[2],...A[N]  denoting the array A.

Constraints: 1≤T≤1000, 2≤N≤10^5, 1≤A[i]≤10^9

Output Format:
For each test case, output YES if the array A is pseudo-sorted, NO otherwise.

Sample Input:
    T = 3
    A = 5
    A[i] = 3 5 7 8 9
    A = 4
    A[i] = 1 3 2 3
    A = 3
    A[i] = 3 2 1
Sample Output:
    o/p1 : YES
    o/p2 : YES
    o/p3 : NO
 */

public class PseudoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j=0; j<t; j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int voilation = 0;
            boolean possible = true;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1; i<n; i++){
                if(arr[i]<arr[i-1]){
                    voilation++;
                    if(voilation>1){
                        possible = false;
                        break;
                    }
                    if(i>1 && arr[i]<arr[i-2])
                        arr[i] = arr[i-1];
                }
            }
            if(possible)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
