package Problem_Solving;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array of integers and an integer k, rotate the array to the left by k positions. Your task is to return the rotated array after performing the operation.
Input:
    An integer array arr[] of size n
    An integer k (number of left rotations)
Output:
    The array after rotating it k times to the left
Example:
    Input: arr = [1, 2, 3, 4, 5], k = 2
    Output: [3, 4, 5, 1, 2]
 */

public class RotateArray {

    public static int[] rotateArray(int[] arr, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = k; i<n;i++){
            ans.add(arr[i]);
        }
        for(int i=0; i<k; i++){
            ans.add(arr[i]);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int k = 2;
        arr = rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}
