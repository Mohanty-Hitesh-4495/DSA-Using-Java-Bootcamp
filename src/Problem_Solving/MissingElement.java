package Problem_Solving;
/*
 Given an array arr[] of size n-1 with distinct integers in the range of [1,n].
 This array represents a permutation of the integers from 1 to n with
 one element missing. Find the missing element in the array.
 Examples:
    Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
    Output: 6
    Explanation: All the numbers from 1 to 8 are present except 6.

    Input: arr[] = [1, 2, 3, 5]
    Output: 4
    Explanation: Here the size of the array is 4, so the range will be [1, 5].
    The missing number between 1 to 5 is 4
 */
public class MissingElement {

    public static int missingElement(int[] arr){
        int n = arr.length;
        int sum1 = 0;
        for(int i=0; i<n; i++){
            sum1 += arr[i];
        }
        int sum2 = 0;
        for(int i=1; i<=n+1; i++){
            sum2 += i;
        }
        return sum2 - sum1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 1};
        System.out.println(missingElement(arr));
    }
}
