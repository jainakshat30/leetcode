public class Shadowing {
    static int x=10; // this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x; // this is known as declaring
        x = 30; // this is known as initialising  // the class variable at line 2 is shadowed by this
        System.out.println(x); // 30
        fun();
    }
    static void fun(){
        System.out.println(x); // top most x will be accessible to it
    }
}
