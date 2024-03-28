import java.util.ArrayList;
import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,9};
//       ArrayList<Integer> ans = findAllIndex1(arr,4,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndex2(arr,4,0));
    }



    //     static void findAllIndex(int[] arr, int target, int index){
//        if(index == arr.length){
//            return;
//        }
//        if(arr[index] == target){
//            list.add(index);
//        }
//        findAllIndex(arr, target,index + 1);
//
//    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex1(arr, target,index + 1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target,index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
