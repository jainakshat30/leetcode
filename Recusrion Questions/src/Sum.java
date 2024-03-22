public class Sum {
    public static void main(String[] args) {
        int ans = sum(100);
        System.out.println(ans);
    }

    static int sum(int n){
        if( n <=1){
            return 1;
        }
        return n + sum(n-1); //here we have returned the function call cause the main body of the function is returning n that is an integer itself so the lower function call will also return an integer
    }
}
