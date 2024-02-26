public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Akshat";
        {
                a=20;   //int a = 20; //if a is already initialised outisde this block we cannot initialise it again but we can change the value
                int c = 25;
            System.out.println(a);
                name = "Paridhi";
            System.out.println(c);
            System.out.println(name);
                        // value initialised in this block will remain only in this block
        }
        int c = 9000;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
        //System.out.println(c); // cannot use outside the block


        // scoping in for loops
        for (int i = 0;i < 4; i++){
            System.out.println();
            int num = 90;
            a = 10;
        }
    }
}
