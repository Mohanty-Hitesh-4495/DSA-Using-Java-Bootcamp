package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: ATM Machine

There is an ATM. Initially, it contains a total of K units of money. N people (numbered 1 through N) want to withdraw money, for each valid i, the i-th person wants to withdraw A[i] units of money.
The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount.
Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.
For each person, determine whether they will get the required amount of money or not.

Input format:
    1. The first line of the input contains a single integer T(No.of experimentation's) denoting the number of test cases. The description of T test cases follows.
        a. The first line of each test case contain two integers separated by space contains N(No.of people in the queue) and K(Total cash in the ATM)
        b. The second line contains space-separated integers A[1], A[2],...A[N].(A[i] =  Cash required by the individuals)

Constraints: - 1≤T≤100, - 1≤N≤100, - 1≤A≤1,000,000 for each valid  - 1≤K≤1,000,000

Output format:
For each test case, print a single line containing a string with length N. For each valid i, the i-th character of this string should be '1' if the i-th person will successfully withdraw their money or '0' otherwise.

Sample Input:
    T =  2
    N, K = 5 10
    A[i]  = 3 5 3 2 1
    N, K = 4 6
    A[i] = 10 8 6 4
Sample Output:
    o/p1 = 11010
    o/p2 = 0010

 */

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0; j<T; j++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] amount = new int[N];
            int[] withdraw = new int[N];
            for(int i=0; i<N; i++){
                amount[i] = sc.nextInt();
                if(amount[i] <= K){
                    withdraw[i] = 1;
                    K -= amount[i];
                } else {
                    withdraw[i] =0;
                }
            }
            System.out.println(Arrays.toString(withdraw));
        }
    }
}
