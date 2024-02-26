//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class ValueAfteroperations {
    public static void main(String[] args) {

    }
    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        char[] c = new char[50];
        for(int i = 0; i < operations.length; i++){
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}
