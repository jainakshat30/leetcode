//https://leetcode.com/problems/height-checker/description/
import java.util.Arrays;
class heightChecker {
    public int heightChecker(int[] heights) {
        int[] ans = new int[heights.length];
        int count = 0;
        for(int i = 0; i < heights.length;i++){
            ans[i] = heights[i];
        }
        Arrays.sort(ans);
        for(int i = 0;i < ans.length;i++){
            if(ans[i] != heights[i]){
                count += 1;
            }
        }
        return count;
    }
}