public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    //my method Space complexity == ?

    static int sumDigit(int n){
        if(n == 0){
            return 0;
        }
        int sum = 0;
        sum = n % 10;
        return sum + sumDigit(n/10);
    }

    //kunal's method Space complexity == O(log(n))

    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
