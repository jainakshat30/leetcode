//https://leetcode.com/problems/left-and-right-sum-differences/description/
//2574

import java.util.Arrays;

class leftRightSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 8};
        int[] result = leftRightDifference(nums);

        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
    static int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        // Calculate prefix sums from the left
        int[] leftSum = new int[n];
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            leftSum[i] = currentSum;
        }

        // Calculate suffix sums from the right
        int[] rightSum = new int[n];
        currentSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            currentSum += nums[i];
            rightSum[i] = currentSum;
        }

        // Calculate absolute differences
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
    }
