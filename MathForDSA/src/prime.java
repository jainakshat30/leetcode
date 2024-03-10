public class prime {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n+1; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
     static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
