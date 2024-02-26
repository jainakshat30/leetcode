import java.util.Arrays;
import java.util.Scanner;

public class noOfSmallerNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            // declare counter
            int count = 0;
            // iterate over nums in j loop
            for(int j = 0; j < nums.length; j++) {
                // check that nums at i and j are not equals and j num is less than i num. if true increment counter
                if(nums[i] != nums[j] && nums[j] < nums[i])
                    count++;
            }
            // set i-th index of answer array as count
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
