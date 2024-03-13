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
        for (int i = 0; i < n+1; i++) {
            for (int j = m; j < m+n; j++) {
                nums1[j] = nums2[i];
            }
        }
        for (int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
    }
}
