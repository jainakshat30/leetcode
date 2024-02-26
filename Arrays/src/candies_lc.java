// 1431 kids with the greatest number of candies
/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class candies_lc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] candies = {4,2,1,1,2};
        int maxCandies = 0;
        int extraCandies = 1;
        for (int candy : candies){
            maxCandies = Math.max(maxCandies,candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies){
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        System.out.println(result);
    }
    
}
