package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement: Coins and Triangle

Matt belongs to a very rich family which owns many gold mines. Today, he brought N gold coins and decided to form a triangle using these coins.
Matt has a unusual way of forming a triangle using gold coins, which is described as follows:
He puts 1 coin in the 1st row, then puts 2 coins in the 2nd row, then puts 3 coins in the 3rd row and so on.
Matt is interested in forming a triangle with maximum possible height using at most N coins. Can you tell him the maximum possible height of the triangle?

Input:
    1. The first line of input contains a single integer T(No.of experimentation's) denoting the number of test cases.
        a. The first and the only line of each test case contains an integer N denoting the number of gold coins Matt has.

Constraints:   1 ≤ T ≤ 100 , 1 ≤ N ≤ 109

Output:
For each test case, output a single line containing an integer corresponding to the
maximum possible height of the triangle that Matt can get.

Sample Input:
    T = 3
    N = 3
    N = 5
    N = 7
Sample Output:
    o/p1 : 2
    o/p2:  2
    o/p3 : 3

 */

public class CoinsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for( int j=0; j<t; j++){
            int coins = sc.nextInt();
            int height = 0;
            int row = 1;
            while(coins >= row){
                coins -= row;
                height ++;
                row++;
            }
            System.out.println(height);
        }
    }
}
