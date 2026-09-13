class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;


            int count = 0;

            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                // Duplicate is in the left half
                end = mid;
            } else {
                // Duplicate is in the right half
                start = mid + 1;
            }

        }
        return start;
    }
}