package Problem_Solving;
import java.util.Scanner;

/*
Problem: Maximum Height of Equilateral Triangle with N Coins

You are given `n` coins. Your task is to build the maximum height of an equilateral triangle using these coins,
such that each row of the triangle has one more coin than the row above it (i.e., 1 + 2 + 3 + ... + h ≤ n).
Find and print the maximum possible height of the triangle.

    Example:
    Input:
    7
    Output:
    3

Explanation:
Rows = [1, 2, 3] → Total = 1+2+3 = 6 coins used, height = 3.
Only 1 coin remains, which is not enough for the next row (needs 4), so max height is 3.
*/

public class BeggerBeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 0;
        int num = 0;
        while( n > num){
            height++;
            n -= num;
            num++;
        }
        System.out.println(height);
    }
}
