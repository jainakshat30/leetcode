public class IthBit {

    public static void main(String[] args) {
        System.out.println(ans(2,65));
    }

    static int ans(int n, int num) {

        return num & (1 << (n - 1));
    }

}
