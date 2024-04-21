import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/submissions/1238224783/
public class Duplicate_Element217 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2};
        boolean ans = duplicate(arr);
        System.out.println(ans);
    }

    static boolean duplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                    return true;
            }
        }
        return false;
    }
}
