public class Fibo {
    public static void main(String[] ars) {
        System.out.println(fibonacci(50));

//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
    }


    static int fiboFormula(int n) {
        // just for demo, use long instead

        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    static int fibonacci(int n){
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
