package Problem_Solving;
import java.util.HashMap;
import java.util.Scanner;

/*
Problem Statement:  Remove Bad Elements

Aniket has an array A of length N. In one operation, Aniket can remove any one element from the array.
Determine the minimum number of operations required to make all the elements the same.

Input Format:
    1. The first line of input will contain a single integer T, denoting the number of test cases.Each test case consists of multiple lines of input.
        a. The first line of each test case contains a single integer —the length of Array A.
        b. Next line contains A space-separated integers A[1], A[2],...A[N] - denoting the array A.

Constraints: 1≤T≤4000, 1≤A≤10^5, 1≤A[i]≤A

Output Format:
For each test case, output the minimum number of operations required to make all the elements the same.

Sample Input:
    T = 3
    A = 3
    A[i] = 3 3 3
    A = 6
    A[i] = 1 3 2 1 2 2
    A = 4
    A[i] = 1 2 1 2
Sample Output:
    o/p1 = 0
    o/p2 = 3
    o/p3 = 2
 */
public class RemoveBadElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int maxFreq = Integer.MIN_VALUE;
            for (int value: map.values()){
                if(value > maxFreq){
                    maxFreq = value;
                }
            }
            int minOpe = arr.length-maxFreq;
            System.out.println(minOpe);
        }
    }
}
