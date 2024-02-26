import static java.util.Collections.swap;

class missingNumber {
    public static void main(String[] args) {
        int nums[] = {4,0,1,2};
        int number = missingNumber(nums);
        System.out.println(number);
    }
        static int missingNumber(int[] nums){

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i];
                if (nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            //search for first missing number
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index) {
                    return index;
                }
            }

            //case 2
            return nums.length;
        }
        static void swap(int[] arr,int first,int second){
            int temmp = arr[first];
            arr[first] = arr[second];
            arr[second] = temmp;

        }
    }
