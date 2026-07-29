class Solution {

    private static final long LIMIT = 1_000_001L;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1) {
                middle = (char) ('a' + i);
            }
            freq[i] /= 2;
        }

        if (countWays(freq) < k) {
            return "";
        }

        int leftLength = s.length() / 2;
        StringBuilder left = new StringBuilder(leftLength);

        for (int pos = 0; pos < leftLength; pos++) {

            for (int c = 0; c < 26; c++) {

                if (freq[c] == 0) continue;

                freq[c]--;

                long ways = countWays(freq);

                if (ways >= k) {
                    left.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways;
                    freq[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder(s.length());

        ans.append(left);

        if (middle != 0) {
            ans.append(middle);
        }

        for (int i = left.length() - 1; i >= 0; i--) {
            ans.append(left.charAt(i));
        }

        return ans.toString();
    }

    private long countWays(int[] freq) {
        long ways = 1;
        int placed = 0;
        for (int f : freq) {
            if (f == 0) continue;
            ways *= combination(placed + f, f);
            if (ways >= LIMIT) {
                return LIMIT;
            }
            placed += f;
        }
        return ways;
    }

    private long combination(int n, int r) {
        r = Math.min(r, n - r);

        long ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (n - r + i) / i;

            if (ans >= LIMIT) {
                return LIMIT;
            }
        }

        return ans;
    }

}