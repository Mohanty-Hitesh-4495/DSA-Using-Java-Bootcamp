package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement: Airline Restriction

Anna has 3 bags that she wants to take on a flight. They weigh A, B, and C kgs respectively. She wants to check-in exactly two of these bags and carry the remaining one bag with her.
The airline restrictions says that the total sum of the weights of the bags that are checked-in cannot exceed D kgs and the weight of the bag which is carried cannot exceed E kgs.
Find if Anna can take all the three bags.

Input Format:
    1. The first line of the input contains a single integer T(no.of experimentation's) denoting the number of test cases. The description of T test cases follows.
    a. Each test case contains a single line of input, five space separated integers A,B,C,D,E.

Constraints: - 1≤T≤36000, - 1≤A,B,C≤10, 15≤D≤20, 5≤E≤10

Output Format:
For each test case, output in a single line answers "YES" if Anna can take all the three
bags with her or "NO" if she cannot.

Sample Input:
    T = 3
    A,B, C, D, E = 1 1 1 15 5
    A,B, C, D, E = 8 7 6 15 5
    A,B, C, D, E = 8 5 7 15 10
Sample Output:
    o/p1 = YES
    o/p2 = NO
    o/p3 = YES
 */

public class AirlineRestriction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();

            if ((A <= E && B+C <= D) || (B <= E && A+C <= D) || (C <= E && A+B <= D)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
