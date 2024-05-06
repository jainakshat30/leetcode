class OneDtoTwoD2022 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;
        int[][] constructedArray = construct2DArray(original, m, n);
        int numRows = constructedArray.length;
        int numCols = constructedArray[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(constructedArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] construct2DArray(int[] original, int m, int n) {
        int k = 0;
        int[][] arr = new int[m][n];
        if(original.length == m*n){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = original[k];
                    k++;
                }
            }
            return arr;
        }

        return arr;

    }

}