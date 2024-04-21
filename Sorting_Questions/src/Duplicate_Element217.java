import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/submissions/1238224783/
public class Duplicate_Element217 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2};
        boolean ans = duplicate(arr);
        System.out.println(ans);
    }

    static boolean duplicate(int[] arr){
       //Approach 1 -- Brute Force (use two for loops to check if the number duplicates or not) time complexity -- O(n*n) ****TLE***


       //Approach 2 -- Sorting the array and checking the adjacent numbers
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                    return true;
            }
        }
        return false;
    }
}
