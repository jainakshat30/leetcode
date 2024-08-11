public class pattern {
    public static void main(String[] args) {
        pattern30(5);
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int cols = 0; cols <= n; cols++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
    
    static void pattern5(int n){
        int counter = 0;
        for (int row = 0; row < 2*n; row++) {
            for (int col = 0; col < counter; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            if (row >= n){
                counter -= 1;
            }else {
                counter += 1;
            }
        }
    }
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2*n; col++) {
                if (col < n-row-1 || col > n+row-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if (col < row || col >= 2 * n - 1 - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            
        }
    }
    
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
