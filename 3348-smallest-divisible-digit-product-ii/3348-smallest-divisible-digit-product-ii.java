class Solution {
    private static final int[][] FACTORS = {
        {0, 0, 0, 0}, // 0 (unused)
        {0, 0, 0, 0}, // 1
        {1, 0, 0, 0}, // 2
        {0, 1, 0, 0}, // 3
        {2, 0, 0, 0}, // 4
        {0, 0, 1, 0}, // 5
        {1, 1, 0, 0}, // 6
        {0, 0, 0, 1}, // 7
        {3, 0, 0, 0}, // 8
        {0, 2, 0, 0}  // 9
    };

    public String smallestNumber(String num, long t) {
        int[] need = factorize(t);
        if (need == null) return "-1";

        int n = num.length();
        int[][] prefix = new int[n + 1][4];

        // prefix[i] = factor contributions from num[0 .. i-1], capped by need.
        for (int i = 0; i < n; i++) {
            System.arraycopy(prefix[i], 0, prefix[i + 1], 0, 4);

            int digit = num.charAt(i) - '0';
            if (digit != 0) {
                add(prefix[i + 1], FACTORS[digit], need);
            }
        }

        // num itself is an answer only when it contains no zero.
        if (num.indexOf('0') == -1 && covers(prefix[n], need)) {
            return num;
        }

        /*
         * Try to increase one digit while keeping the longest prefix unchanged.
         * Any zero in the kept prefix makes that candidate invalid.
         */
        int firstZero = num.indexOf('0');

        for (int i = n - 1; i >= 0; i--) {
            // If a zero exists before i, it would remain in the prefix.
            if (firstZero != -1 && firstZero < i) continue;

            int original = num.charAt(i) - '0';

            for (int digit = original + 1; digit <= 9; digit++) {
                int[] have = prefix[i].clone();
                add(have, FACTORS[digit], need);

                int[] remaining = remainingNeed(need, have);
                int suffixLength = n - i - 1;

                if (minDigitsRequired(remaining) <= suffixLength) {
                    String suffix = buildSmallestSuffix(remaining, suffixLength);

                    StringBuilder ans = new StringBuilder(n);
                    ans.append(num, 0, i);
                    ans.append((char) ('0' + digit));
                    ans.append(suffix);
                    return ans.toString();
                }
            }
        }

        /*
         * No same-length answer exists.
         * Any number with n + 1 digits is larger than num, so construct the
         * smallest valid zero-free number of a feasible longer length.
         */
        int required = minDigitsRequired(need);
        int length = Math.max(n + 1, required);

        return buildSmallestSuffix(need, length);
    }

    // Returns needed exponents of {2, 3, 5, 7}; null if another prime remains.
    private int[] factorize(long t) {
        int[] need = new int[4];
        int[] primes = {2, 3, 5, 7};

        for (int i = 0; i < 4; i++) {
            while (t % primes[i] == 0) {
                need[i]++;
                t /= primes[i];
            }
        }

        return t == 1 ? need : null;
    }

    private void add(int[] target, int[] contribution, int[] cap) {
        for (int i = 0; i < 4; i++) {
            target[i] = Math.min(cap[i], target[i] + contribution[i]);
        }
    }

    private boolean covers(int[] have, int[] need) {
        for (int i = 0; i < 4; i++) {
            if (have[i] < need[i]) return false;
        }
        return true;
    }

    private int[] remainingNeed(int[] need, int[] have) {
        int[] remaining = new int[4];

        for (int i = 0; i < 4; i++) {
            remaining[i] = Math.max(0, need[i] - have[i]);
        }

        return remaining;
    }

    /*
     * Minimum digits needed to provide exactly-or-more than the remaining
     * exponents. 5 and 7 need their own digits. For 2 and 3, use the best
     * combinations of 8, 9, 6, 4, 2, 3.
     */
    private int minDigitsRequired(int[] rem) {
    int two = rem[0];
    int three = rem[1];

    int count = rem[2] + rem[3];

    count += two / 3;
    two %= 3;

    count += three / 2;
    three %= 2;

    if (two == 2 && three == 1) return count + 2; // 26 or 38
    if (two == 1 && three == 1) return count + 1; // 6
    if (two == 2) return count + 1;               // 4
    if (two == 1) return count + 1;               // 2
    if (three == 1) return count + 1;             // 3

    return count;
}

    /*
     * Generates the lexicographically smallest string of exactly 'length'
     * digits whose product supplies 'rem'. Extra positions become '1'.
     */
    private String buildSmallestSuffix(int[] rem, int length) {
        int two = rem[0];
        int three = rem[1];
        int five = rem[2];
        int seven = rem[3];

        StringBuilder core = new StringBuilder();

        // Use 8 and 9 for bulk factors first.
        while (two >= 3) {
            core.append('8');
            two -= 3;
        }

        while (three >= 2) {
            core.append('9');
            three -= 2;
        }

        // Resolve remaining 2s and 3s with minimal number of digits.
        if (two == 2 && three == 1) {
            core.append('6');
            core.append('2');
        } else if (two == 1 && three == 1) {
            core.append('6');
        } else {
            if (two == 2) core.append('4');
            else if (two == 1) core.append('2');

            if (three == 1) core.append('3');
        }

        while (five-- > 0) core.append('5');
        while (seven-- > 0) core.append('7');

        char[] digits = core.toString().toCharArray();
        java.util.Arrays.sort(digits);

        StringBuilder result = new StringBuilder(length);

        // Leading 1s make the suffix lexicographically smallest.
        for (int i = digits.length; i < length; i++) {
            result.append('1');
        }

        result.append(digits);
        return result.toString();
    }
}