package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement:
You are given an array of integers. Your task is to count the number of pairs (i, j) (where i < j) such that the sum of the two numbers is even.
Formally, find the total number of pairs (i, j) where: (𝑎𝑟𝑟[𝑖]+𝑎𝑟𝑟[𝑗])%2=0

Input Format:
    -The first line contains an integer T — the number of test cases.
For each test case:
    -The first line contains an integer N — the size of the array.
    -The second line contains N integers — the elements of the array.
Output Format:
    For each test case, print the total count of pairs with an even sum.
 */

public class EvenPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int l=0; l<test; l++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int k=0; k<n; k++){
                arr[k]=sc.nextInt();
            }
            int count = 0;
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if((arr[i]+arr[j])%2 == 0) count++;
                }
            }
            System.out.println(count);
            }
    }

}
