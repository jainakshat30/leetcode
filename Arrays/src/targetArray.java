import java.util.ArrayList;
import java.util.Arrays;

/*
1389 Create target array in the given order
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
https://leetcode.com/problems/create-target-array-in-the-given-order/description/
 */
public class targetArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] index = {0, 1, 2, 2, 1};

        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            ans.add(index[i],nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            target[i] = ans.get(i);
        }
        return target;
    }

}
