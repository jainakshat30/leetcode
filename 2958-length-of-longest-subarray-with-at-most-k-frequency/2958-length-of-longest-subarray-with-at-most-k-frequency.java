class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0 ; right < nums.length;right++){
            int val = nums[right];
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            while(freq.get(val) > k){
                int leftval = nums[left];
                freq.put(leftval,freq.get(leftval) - 1);
                if(freq.get(leftval) == 0){
                    freq.remove(leftval);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}