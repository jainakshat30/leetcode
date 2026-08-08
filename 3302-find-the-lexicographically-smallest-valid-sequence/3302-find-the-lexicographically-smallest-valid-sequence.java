class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // suf[i] = how many characters of word2
        // are still unmatched after matching from word1[i...n-1]
        int[] suf = new int[n + 1];

        int j = m;
        suf[n] = m;

        // Match word2 from the end
        for (int i = n - 1; i >= 0; i--) {
            if (j > 0 && word1.charAt(i) == word2.charAt(j - 1)) {
                j--;
            }

            suf[i] = j;
        }

        int[] ans = new int[m];
        int size = 0;

        j = 0;
        boolean changed = false;

        // Greedily choose the smallest possible indices
        for (int i = 0; i < n && j < m; i++) {

            // Exact match
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[size++] = i;
                j++;
            }

            // Use our one allowed mismatch
            else if (!changed && suf[i + 1] <= j + 1) {
                changed = true;
                ans[size++] = i;
                j++;
            }
        }

        // Couldn't form word2
        if (size != m) {
            return new int[0];
        }

        return ans;
    }
}