import java.util.Arrays;

//https://leetcode.com/problems/largest-perimeter-triangle/description/

class trianglePerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        for(int i = n; i>1;i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if(b + c > a){
                return a + b + c;
            }
        }
        return 0;
    }
}