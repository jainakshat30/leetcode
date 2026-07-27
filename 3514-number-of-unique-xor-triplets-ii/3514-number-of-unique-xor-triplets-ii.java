class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] pair = new boolean[2048];

        
        for (int a : nums) {
            for (int b : nums) {
                pair[a ^ b] = true;
            }
        }

        boolean[] ans = new boolean[2048];

        for (int xor = 0; xor < 2048; xor++) {
            if (!pair[xor])
                continue;
            for (int num : nums) {
                ans[xor ^ num] = true;
            }
        }
        int count = 0;

        for (boolean x : ans)
            if (x)
                count++;

        return count; 
    }
}