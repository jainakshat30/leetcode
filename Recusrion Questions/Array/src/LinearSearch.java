public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9};
        System.out.println(findIndexLast(arr,2,6));
    }

    //my method
    static boolean search(int[] arr, int target, int index){
        if(index > arr.length-1){  //base condition if index is more than the length of the arr.length just return false
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return arr[index] == target || search(arr,target,index+1);
    }

    //kunal's method
    static boolean search1(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }


//to find index value
    static int findIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target ){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }

    }

    //to find index from last
    static int findIndexLast(int[] arr, int target, int index){

        if(index == -1){
            return -1;
        }
        if (arr[index] == target ){
            return index;
        }
        else{
            return findIndexLast(arr,target,index - 1);
        }

    }
}
