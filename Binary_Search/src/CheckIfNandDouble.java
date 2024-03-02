//https://leetcode.com/problems/check-if-n-and-its-double-exist/
class CheckIfNandDouble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(checkIfExist(arr));
    }
    //brute force approach
    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[i] * 2 == arr[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}