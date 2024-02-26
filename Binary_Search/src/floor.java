public class floor {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int ans = floor(arr,20);
        System.out.println(ans);
    }


    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
         while(start < end){
             int mid = end + (start - end)/2;

             if (arr[start] == target){
                 return mid;
             } else if (arr[mid] < target) {
                 start = mid + 1;
             } else if (arr[mid] > target) {
                 end = mid - 1;
             }
         }
         return arr[end];
    }
}
