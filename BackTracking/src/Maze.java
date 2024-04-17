public class Maze {
    public static void main(String[] args) {
        int ans = count(3,3);
        System.out.println(ans);
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(c-1,r);
        return left + right;
    }
}