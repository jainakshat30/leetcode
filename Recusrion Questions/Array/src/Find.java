import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,9};
        findAllIndex(arr,4,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
     static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target,index + 1);

    }
}
