//https://leetcode.com/problems/build-array-from-permutation/description/

public class arrayfrompermutation {
    public static void main(String[] args) {

    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
