class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(28));
    }
    static int mySqrt(int n) {
        int low = 1;
        int high = n;


        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}