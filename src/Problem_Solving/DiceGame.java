package Problem_Solving;
import java.util.Scanner;
/*
Problem: Dice Game
Given scores of 3 dice rolls for two players (Alice and Bob), determine who has the higher total of the **top two** dice rolls.
Print "Alice", "Bob", or "Tie" accordingly for each test case.

    Example:
    Input:
    2
    3 6 4 2 4 6
    1 2 3 3 2 1

    Output:
    Alice
    Tie
*/

public class DiceGame {

    public static int maxSum(int a, int b, int c){
        int sum = a+b+c;
        int min = Math.min(a,Math.min(b,c));
        return sum-min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] ans = new String[num];
        for (int i = 0; i< num; i++){
            int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();
            int b1 = sc.nextInt(), b2 = sc.nextInt(), b3 = sc.nextInt();
            int aSum = maxSum(a1,a2,a3);

            int bSum = maxSum(b1, b2,b3);
            if (aSum > bSum)
                ans[i] = "Alice";
            else if (aSum < bSum)
                ans[i] = "Bob";
            else
                ans[i] = "Tie";
        }
        for( String item : ans){
            System.out.println(item);
        }
    }
}
