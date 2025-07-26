package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: Bheem's Aggressive Animals
You are given n stall positions along a straight line.
Your task is to place A animals in these stalls such that the minimum distance between any two animals is as large as possible.
Print the maximum possible value of this minimum distance.

Input Format:
    First line: Integer n – number of stalls
    Second line: n space-separated integers – positions of the stalls
    Third line: Integer k – number of animals to place

Example:
    Input:
    5
    1 2 8 4 9
    3
    Output:
    3

Explanation:
Animals can be placed at stalls 1, 4, and 8 or 1, 4, and 9, with a minimum distance of 3 between any two.
 */

public class BheemsAggressiveAnimals {

    // Function to check if we can place 'animals' animals
    // such that the minimum distance between any two is at least 'mid' distance
    public static boolean canWePlace(int[] stalls, int animals, int dist){
        int lastPlaced = stalls[0];
        int cntAnimals = 1;
        for(int i=1; i<stalls.length; i++){
            if((stalls[i]-lastPlaced) >= dist){
                cntAnimals++;
                lastPlaced = stalls[i];
            }
            if(cntAnimals >= animals)
                return true;
        }
        return false;
    }

    // Binary search on answer
    public static int minimumDistance(int[] stalls, int n, int animals){
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        while(low <= high){
            int mid = low+(high-low)/2;
            if (canWePlace(stalls,animals, mid)){ // Valid distance, try to maximize
                low = mid+1;
            }
            else{
                high = mid-1;  // Too far apart, reduce distance
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of stalls
        int a = sc.nextInt(); // number of animals

        int[] stalls = new int[n];
        for(int i=0; i<n; i++){
            stalls[i] = sc.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(minimumDistance(stalls,n,a));
    }
}

