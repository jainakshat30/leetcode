//https://leetcode.com/problems/score-of-a-string/description/?envType=daily-question&envId=2024-06-02

class StringScore {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);
            int value1 = (int) c1;
            int value2 = (int) c2;
            sum = sum + Math.abs(c1-c2);
        }
        return sum;
    }
}