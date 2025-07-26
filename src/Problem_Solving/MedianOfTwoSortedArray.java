package Problem_Solving;
import java.util.Scanner;
/*
Problem: Median of Two Sorted Arrays (Multiple Test Cases)

You are given multiple test cases. For each test case, you're given two **sorted arrays** of integers.
Your task is to:
1. Merge both sorted arrays into one sorted array.
2. Find the **median** of the merged array.
3. Return the **sum of medians** for all test cases.

Note:
- If the merged array has an odd number of elements, the median is the middle element.
- If even, the median is the average of the two middle elements (rounded down using integer division).

Example:
Input:
2
3 3
1 3 5
2 4 6
2 2
1 2
3 4

Output:
5

Explanation:
Test Case 1 → Merged = [1,2,3,4,5,6] → Median = (3+4)/2 = 3
Test Case 2 → Merged = [1,2,3,4] → Median = (2+3)/2 = 2
Sum of medians = 3 + 2 = 5
*/

public class MedianOfTwoSortedArray {

    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] sorted = new int[n+m];
        int left = 0;
        int right = 0;
        int i=0;
        while (left<n && right<m){
            if(arr1[left] < arr2[right]){
                sorted[i] = arr1[left];
                i++;
                left++;
            } else {
                sorted[i] = arr2[right];
                i++;
                right++;
            }
        }
        while (left<n){
            sorted[i] = arr1[left];
            i++;
            left++;
        }
        while (right<m){
            sorted[i] = arr2[right];
            i++;
            right++;
        }
        return sorted;
    }

    public static int median(int[] arr){
        int len = arr.length;
        if (len%2 != 0){
            return arr[len/2];
        } else{
            return (arr[len/2]+arr[len/2]-1)/2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i=0; i<num; i++){
            int len1 = sc.nextInt();
            int len2 = sc.nextInt();
            int[] arr1 = new int[len1];
            int[] arr2 = new int[len2];
            for(int j=0; j<len2; j++){
                arr1[j] = sc.nextInt();
            }
            for(int j=0; j<len1; j++){
                arr2[j] = sc.nextInt();
            }
            sum += median(merge(arr1, arr2));
        }
        System.out.println(sum);
    }
}
