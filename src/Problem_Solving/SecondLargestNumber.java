package Problem_Solving;
import java.util.Scanner;

/*
 Second Largest
 Three numbers A, B and C are the inputs. Write a program to find second largest among them.
Input Format
    The first line contains an integer T, the total number of testcases.
    Then T lines follow, each line contains three integers A, B and C.
Output Format
    For each test case, display the second largest among A, B and C, in a new line
 */

public class SecondLargestNumber {
    public static int findSecondLargest(int a, int b, int c){
        if((a>b && a<c) || (a>c && a<b))
            return a;
        else if ((b<a && b>c) || (b>a && b<c))
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int secondLargest = findSecondLargest(A, B, C);
            System.out.println(secondLargest);
        }
    }
}
