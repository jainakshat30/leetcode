//https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/4070500/99-journey-from-brute-force-to-most-optimized-three-approaches-easy-to-understand/

import java.util.Arrays;

class MedianSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    //brute force method

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int a = m+n;
        int[] merged = new int[a];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m+i] = nums2[i];
        }
        Arrays.sort(merged);
        if (a %2 == 0) {
            int middle1 = merged[a / 2 - 1];
            int middle2 = merged[a / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
        else{
            return merged[(a)/2];
        }

    }
}