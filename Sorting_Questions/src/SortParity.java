class SortParity {
    public static void main(String[] args) {

    }
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        while(l < h){
            if (nums[l]%2 == 0 && nums[h]%2 == 1) {
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;
                l++;
                h--;
            } else if (nums[l]%2 == 0 && nums[h]%2 == 1) {
                l++;
                h--;
            }else if(nums[l]%2 == 0 && nums[h]%2 == 0){
                l++;
            }else if(nums[l] % 2 == 1 && nums[h] % 2 == 1){
                h--;
            }
        }
        return nums;
    }
}