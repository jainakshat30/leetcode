class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    int digitProduct(int n){
        if(n == 0) return n;
        int prod = 1;
        while(n > 0){
            int div = n % 10;
            prod *= div;
            n /= 10;
        }
        return prod;
    }
}