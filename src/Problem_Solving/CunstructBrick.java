package Problem_Solving;
import java.util.Scanner;

/*
You are given N bricks and want to construct a pyramid. A pyramid is built in layers where the i-th layer (from the top) requires i bricks.
    • The 1st layer requires 1 brick.
    • The 2nd layer requires 2 bricks.
    • The 3rd layer requires 3 bricks.
    • And so on.
Your task is to determine the maximum number of complete layers you can build using the given N bricks.
Input Format
    • The first line of the input contains the number of test cases, T.
    • For each test case, a single integer, N, represents the number of bricks available.
Output Format
    • A single integer representing the maximum number of complete layers you can build.

 Input       Output
 2             3
 8             5
 15
 */

public class CunstructBrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int bricks = sc.nextInt();
            int count = 0, row = 0;
            while(bricks > row){
                count++;
                row++;
                bricks -= row;
            }
            System.out.println(count);
        }
    }
}
