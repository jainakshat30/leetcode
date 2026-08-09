class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder cleaned = new StringBuilder();

        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         cleaned.append(Character.toLowerCase(c));
        //     }
        // }

        // String result = cleaned.toString();
        // String reversed = cleaned.reverse().toString();

        // return result.equals(reversed);

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

}