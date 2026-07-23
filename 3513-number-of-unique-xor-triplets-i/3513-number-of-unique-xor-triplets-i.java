class Solution {
    public int uniqueXorTriplets(int[] nums) {
        //java stores wvery int as 32 bit so 5 is stored as 00000000000000000000000000000101
        int n = nums.length;
        
        if (n == 1) return 1;
        if (n == 2) return 2;

        int k = 32 - Integer.numberOfLeadingZeros(n);
        return 1 << k;
    }
}