package Problem_Solving;
import java.util.Arrays;
import java.util.HashMap;

/*
Given two arrays, a and b of equal length. The task is to determine if
the given arrays are equal or not. Two arrays are considered equal if:
Both arrays contain the same set of elements.The arrangements (or permutations) of elements may be different.

If there are repeated elements, the counts of each element must be
the same in both arrays.

Examples:
    Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
    Output: true
    Input: a[] = [1, 2, 5, 4, 0, 2, 1], b[] = [2, 4, 5, 0, 1, 1, 2]
    Output: true
    Input: a[] = [1, 7, 1], b[] = [7, 7, 1]
    Output: false
 */

public class EqualArrays {

    // Bruteforce: sorting both arrays and comparing elements.
    public static boolean checkEqual(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Optimal: using HashMap to store elements and frequency to compare for both arrays.
    public static boolean checkArrayEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;
        int n = arr1.length;

        HashMap<Integer,Integer> freqA = new HashMap<>();
        HashMap<Integer,Integer> freqB = new HashMap<>();

        for(int i=0; i<n; i++){
            freqA.put(arr1[i], freqA.getOrDefault(arr1[i],0)+1);
            freqB.put(arr2[i], freqB.getOrDefault(arr2[i], 0)+1);
        }

        return freqA.equals(freqB);
    }


    public static void main(String[] args) {
        int[][] testA = {
                {1, 2, 5, 4, 0},
                {1, 2, 5, 4, 0, 2, 1},
                {1, 7, 1},
                {1, 2, 3},
                {1, 1, 1}
        };

        int[][] testB = {
                {2, 4, 5, 0, 1},
                {2, 4, 5, 0, 1, 1, 2},
                {7, 7, 1},
                {3, 2, 1},
                {1, 1, 2}
        };

        for (int i = 0; i < testA.length; i++) {
            boolean result = checkArrayEqual(testA[i], testB[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }

}
