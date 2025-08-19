package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement: Break Stick

Akash has a stick of length N. He can break the stick into 2 or more parts such that the parity of length of each part is the same.
(Example of parity being same : a stick of length 11 can be broken into three sticks of lengths {3, 3, 5} since each part is odd - that means they have same parity,
but if we break it into two sticks of lengths {5,6} since one is even and the other is odd - It is considered that their parity is different.)

Problem: Can Akash obtain a stick of length exactly X by doing this by maintaining the same parity?
Input Format:
1. The first line of input will contain a single integer T(No.of experimentation's), denoting the number of test cases. The description of the test cases follows.
    a.  Each test case consists of a single line of input, containing two space-separated integers N(length of the stick), and X(Required size of the stick).

Constraints:  1≤T≤1000  and  1≤X<N≤10^9

Output Format:
For each test case, output on a new line YES if Akash can obtain a stick of length
exactly X, and NO otherwise.

    Sample Input:
    T = 3
    N,X = 6 1
    N,X = 3 2
    N,X = 4 3
    Sample Output:
    YES
    NO
    YES
 */

public class BreakStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            if(X >= N) System.out.println("NO");
            else if (N%2 == 1){
                if (X%2 == 1) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
