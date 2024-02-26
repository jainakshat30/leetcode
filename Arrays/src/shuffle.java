/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/
//https://leetcode.com/problems/shuffle-the-array/description/

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int size = 0;
//        size = in.nextInt();
//        int[] nums = new int[size];
//// reading the values from user in nums
//        for (int i = 0; i < size; i++) {
//            nums[i] = in.nextInt();
//        }
//// shuffeling the values
//        for (int i = 0; i < size; i++) {
//            int n = size/2;
//            nums[i] = nums[i];
//
//            nums[i+1] = nums[n+1];
//        }
//
//        System.out.println(Arrays.toString(nums));


















        int n = 3;

        int[] arr = new int[6];
        int [] nums = {2,5,1,3,4,7};
        int point = 0;
        for (int i = 0; i < n; i++) {
            arr[point] = nums[i];
            arr[point+1] = nums[i+n];
            point = point + 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
