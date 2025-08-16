package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement:
In a scholarship distribution system, students are ranked based on their performance. Each student must receive at least 1 unit of scholarship.
Moreover, a student with a better rank (lower number) must receive strictly more scholarship units than the student ranked immediately below them.
Given the ranks of students, determine the minimum total scholarship units that must be distributed.

Input:
- First line contains an integer T – the number of test cases.
For each test case:
- First line contains integer N – the number of students.
- Next line contains N integers representing the ranks of students.
Output:
- For each test case, print the minimum total scholarship units required.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
Ranks are integers ≥ 1
 */

public class MeritScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] min = new int[test];

        for (int i = 0; i < test; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            int[] discount = new int[N];
            discount[N-1] = 1;

            // Loop forward to assign discounts
            for (int j = N-2; j >= 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    discount[j] = discount[j + 1] + 1;
                } else {
                    discount[j] = discount[j - 1];
                }
            }

            int sum = 0;
            for (int dis : discount) {
                sum += dis;
            }
            min[i] = sum;
        }

        for (int i = 0; i < test; i++) {
            System.out.println(min[i]);
        }
    }
}
