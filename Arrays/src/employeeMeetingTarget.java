//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

public class employeeMeetingTarget {
    public static void main(String[] args) {

    }
    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}
