package Problem_Solving;
import java.util.Scanner;

/*
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate
from left to right and replace the characters as follows:
 • 00 is replaced with A
 • 01 is replaced with T
 • 10 is replaced with C
 • 11 is replaced with G
 Given a binary string S of length N (N is even), find the encoded sequence.
 Input Format
 • First line will contain T, number of test cases. Then the test cases follow.
 • Each test case contains two lines of input.
 • First line contains a single integer N, the length of the sequence.
 • Second line contains binary string S of length N.
 Output Format
 For each test case, output in a single line the encoded sequence.
 Note: Output is case-sensitive.
 Input     Output
 4           A
 2           AG
 00          CCC
 4           CT
 0011
 6
 101010
 4
 1001
 */

public class BinaryStringEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int size = sc.nextInt();
            String str = sc.next();
            StringBuilder encoded = new StringBuilder();
            for(int j=0; j<size; j+=2){
                if (str.substring(j,j+2).equals("00")){
                    encoded.append("A");
                } else if (str.substring(j,j+2).equals("01")){
                    encoded.append("T");
                } else if (str.substring(j, j+2).equals("10")){
                    encoded.append("C");
                } else {
                    encoded.append("G");
                }
            }
            System.out.println(encoded);
        }
    }
}
