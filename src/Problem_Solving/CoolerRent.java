package Problem_Solving;
import java.util.Scanner;

/*
The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:
 • Rent a cooler at the cost of X coins per month.
 • Purchase a cooler for Y coins.
Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.

Input Format
 • The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
 • The first and only line of each test case contains two integers X and Y, as described in the problem statement.
Output Format
 For each test case, output the maximum number of months for which
 he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.
 If Chef should not rent a cooler at all, output 0.
Input Output
 2 2
 5 12 0
 5 5
 */

public class CoolerRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0; i<testcase; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X>=Y) {
                System.out.println(0);
                continue;
            }
            int months = Y/X;
            System.out.println(months);
        }
    }
}
