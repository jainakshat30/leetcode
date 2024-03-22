public class DigitSum {
    public static void main(String[] args) {
        int ans = sumDigit(1342);
        System.out.println(ans);
    }

    static int sumDigit(int n){
        if(n == 0){
            return 0;
        }
        int sum = 0;
        sum = n % 10;
        return sum + sumDigit(n/10);
    }
}
