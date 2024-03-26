public class CountZero {
    public static void main(String[] args) {
        int num = 1020304050;
        System.out.println("Number of zeroes in " + num + ": " + countZeroes(num));
        System.out.println("Number of zeroes in " + num + ": " + count(num));
    }

    //brute force - using for loop and pointer
    public static int countZeroes(int number) {
        int count = 0;
        while (number != 0) {
            // Check if the last digit is zero
            if (number % 10 == 0) {
                count++;
            }
            // Remove the last digit
            number /= 10;
        }
        return count;
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
