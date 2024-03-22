public class Fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if( n <=1){
            return 1;
        }
        return n * fact(n-1); //here we have returned the function call cause the main body of the function is returning n that is an integer itself so the lower function call will also return an integer
    }
}
