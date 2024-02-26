import java.util.Arrays;
import java.util.Scanner;
/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
https://leetcode.com/problnifRWems/concatenation-of-array/description/
*/
    public class ConcatetionOfArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();

            int[] nums = new int[size];
            System.out.println("Enter the elements:");

            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();

            }

            int[] concatenated = getConcatenation(nums);

            System.out.println("Concatenated Array:");
            for (int i = 0; i < concatenated.length; i++) {
                System.out.print(concatenated[i] + " ");
            }

            scanner.close(); // Close the scanner
        }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // to make an array of size n

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
    }


