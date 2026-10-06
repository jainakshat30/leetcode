class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0){
                element = num;
            }

            int current = num;
            if(current == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}