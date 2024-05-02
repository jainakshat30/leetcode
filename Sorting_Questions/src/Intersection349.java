import java.util.ArrayList;
import java.util.Arrays;

class Intersection349 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,2,1};
        int[] arr2 = {2,2,2};
        ArrayList<Integer> list = intersection(arr1,arr2);
        System.out.println(list);
    }
    //Problem with this code is that it is not keeping the check for duplicate values
    static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Integer lastAdded = null;

        while(i < nums1.length && j < nums2.length){

            //adding this condition for stopping adding duplicate elements
            if (nums1[i] == nums2[j]) {
                if (lastAdded == null || nums1[i] != lastAdded) {
                    list.add(nums1[i]);
                    lastAdded = nums1[i];
                }
                    i+=1;
                    j+=1;
            } else if (nums1[i] < nums2[j]) {
                i += 1;
            }else {
                j += 1;
            }
        }


        return list;
    }
}
