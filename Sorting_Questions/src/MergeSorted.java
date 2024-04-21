//https://leetcode.com/problems/merge-sorted-array/
class MergeSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1 (starting from end of valid elements)
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for merged array (nums1)

        // Merge nums1 and nums2 from the end by comparing elements
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Place larger element from nums1
            } else {
                nums1[k--] = nums2[j--]; // Place element from nums2
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // Printing the merged array (nums1)
        for (int idx = 0; idx < nums1.length; idx++) {
            System.out.print(nums1[idx] + " ");
        }
}
}
