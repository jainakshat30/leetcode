// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int[] nums = {23,45,1,2,3,8,19,-3,16,11,28};
    int target = 119;
    int ans = linearsearch2(nums,target);
        System.out.println(ans);

    }

    //search the array and return true or false
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop:

        for (int element : arr) {
            // check for element at every index:
            if (element == target) {
                return true;
            }
        }
        return true; //this line will execute only if the element is not found in the array
    }



    //search the arrays and return the element itself
    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop:

        for (int element : arr) {
            // check for element at every index:
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE; //this line will execute only if the element is not found in the array
    }





        // search in the array
        //otherwise return item not found -1

//    static int linearsearch(int[] arr, int target){
//        if (arr.length == 0){
//            return -1;
//        }
//
//        //run a for loop:
//
//        for (int index = 0; index < arr.length; index++) {
//            // check for element at every index:
//            int element = arr[index];
//            if (element == target) {
//                return index;
//
//            }
//        }
//        return -1; //this line will execute only if the element is not found in the array
//     }
}