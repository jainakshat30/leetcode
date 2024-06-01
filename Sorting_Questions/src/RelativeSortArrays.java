import java.util.Arrays;

class RelativeSortArrays {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int[] result = new int[arr1.length];
        boolean[] used = new boolean[arr1.length];
        for(int i = 0; i < arr2.length; i++){
            int el = arr2[i];
            for(int j = 0; j < arr1.length;j++){
                if(arr1[j] == el){
                    result[k] = arr1[j];
                    k++;
                    used[j] = true;
                }
            }
        }
        int[] remaining = new int[arr1.length - k];
        int index = 0;
        for (int j = 0; j < arr1.length; j++) {
            if (!used[j]) {
                remaining[index] = arr1[j];
                index++;
            }
        }
        Arrays.sort(remaining);
        for (int j = 0; j < remaining.length; j++) {
            result[k] = remaining[j];
            k++;
        }
        return result;
    }
}