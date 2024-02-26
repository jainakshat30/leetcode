//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class allMissingNumbers {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        // to find the disappeared numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}
