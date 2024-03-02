//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
}