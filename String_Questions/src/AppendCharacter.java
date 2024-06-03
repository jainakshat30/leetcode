//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/
class AppendCharacter {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length() - j;
    }
}