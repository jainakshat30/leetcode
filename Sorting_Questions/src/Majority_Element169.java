//https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;

public class Majority_Element169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = booyerMoore(nums);
        System.out.println(ans);
    }


    //Approach 1 -- if the number is repeating for more than n/2 times than if we sort the array than the element at the n/2th index will be the most repeated element
    static int majorityElement(int[] nums){
        Arrays.sort(nums);
        int ans = nums[(nums.length-1)/2];
        return ans;
    }

    //Approach 2 -- BOYER MOORE VOTING ALGORITHM

        static int booyerMoore(int[] v){
            int n = v.length;
            int cnt = 0; // count
            int el = 0; // Element

            //applying the algorithm:
            for (int i = 0; i < n; i++) { //2 2 1 1 1 2 2
                if (cnt == 0) {
                    cnt = 1;
                    el = v[i];
                } else if (el == v[i]) {
                        cnt++;
                    }
                else cnt--;
            }

            //checking if the stored element
            // is the majority element:
            int cnt1 = 0;
            for (int i = 0; i < n; i++) {
                if (v[i] == el) cnt1++;
            }

            if (cnt1 > (n / 2)) return el;
            return -1;
        }
}
