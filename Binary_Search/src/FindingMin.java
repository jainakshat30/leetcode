//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/submissions/1206162972/

class FindingMin {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] < nums[end]){
                end = mid;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else {
                end--;
            }
        }
        return nums[start];
    }
}