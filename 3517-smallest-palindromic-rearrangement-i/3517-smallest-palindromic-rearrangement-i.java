class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];

        int length = s.length();

        if(length == 1) return s;

        for(int i = 0; i < length;i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            arr[index]++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            int count = arr[i];
            char c = (char) ('a' + i);

            if ((count & 1) == 1) {
                middle = c;
            }

            for (int k = 0; k < count / 2; k++) {
                left.append(c);
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        if (middle != 0) ans.append(middle);
        ans.append(right);

        return ans.toString();
    }
}