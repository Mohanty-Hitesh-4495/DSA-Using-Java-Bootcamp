package Problem_Solving;

import java.util.Scanner;

/*
Problem: Briench Game
Given scores of two players over multiple rounds, find the player with the maximum lead in any round and print the player number and their lead.

    Example:
    Input:
    3
    140 82
    89 134
    90 110

    Output:
    2 45
*/

public class BrienchGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDiff1 = 0;
        int maxDiff2 = 0;
        for (int i=0; i<num; i++){
            int player1 = sc.nextInt();
            int player2 = sc.nextInt();
            if (player1 > player2)
                maxDiff1 = Math.max(maxDiff1, player1-player2);
            else
                maxDiff2 = Math.max(maxDiff2, player2-player1);
        }
        if (maxDiff1 > maxDiff2)
            System.out.print("1 "+ maxDiff1);
        else
            System.out.print("2 "+ maxDiff2);
    }
}
