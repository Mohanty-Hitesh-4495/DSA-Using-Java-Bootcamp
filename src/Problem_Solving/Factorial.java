package Problem_Solving;
import java.util.Scanner;

/*
Problem Statement:
You are given an integer N, and you need to compute the factorial of the number (N!) without using the multiplication (*) or division (/) operators.
Instead, you must simulate multiplication using only addition.

The factorial of a number N is defined as: 𝑁!=𝑁×(𝑁−1)(𝑁−2)×...×1
In this problem, multiplication must be performed through repeated addition.

Example
Input:
    1
    5
Output:
    120

 */

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int k=0; k<test; k++){
            int num = sc.nextInt();
            int sum = num;
            for(int i=num-1; i>1; i--){
                int temp = 0;
                for(int j=i; j>0; j--){
                    temp += sum;
                }
                sum = temp;
            }
            System.out.println(sum);
        }
    }
}
