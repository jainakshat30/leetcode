public class ReverseNumber {
    //way 1
    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    //2nd method Without making an helper function
    static int rev2(int n, int arg){
        if(n == 0){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,arg-1)) + rev2(n/10,arg-1);
    }


    //3rd method Making an helper function outside our original reverse function
    static int rev3(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1; // formula to get the number of digits in a number
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static void main(String[] args) {
        System.out.println(rev3(1234));

    }
}