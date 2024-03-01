//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (end - start > 1) {
            int i = start + (end - start) / 2;
            if (target > nums[i]) {
                start = i;
            } else {
                end = i;
            }
        }
        if (target <= nums[start]) {
            return start;
        } else {
            return end;



        }
    }
}
