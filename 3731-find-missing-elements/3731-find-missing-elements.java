class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            for (int x = nums[i - 1] + 1; x < nums[i]; x++) {
                list.add(x);
            }
        }

        return list;

    }
}
