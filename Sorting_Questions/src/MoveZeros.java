//https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

class MoveZeros {
    public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
        int[] ans = new int[nums.length];
        ans = moveZeroes(nums);

            System.out.println(Arrays.toString(ans));

    }
    static int[] moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }  
        return nums;
    }
}