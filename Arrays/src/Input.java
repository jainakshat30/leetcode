import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // arrays of primitive-
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 20;
//        arr[3] = 40;
//        arr[4] = 50;
//        System.out.println(arr[3]);

//        for (int i = 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(arr));

//        int a = arr.length;
//        System.out.println(a);


//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//
//        }

//        for(int num:arr){
//            System.out.print(num + " ");
//        }

        // arrays of object-
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));





    }

}
