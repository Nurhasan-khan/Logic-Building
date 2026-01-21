package looping_patterns;

public class Patterns {

    /**
     *    *****
     *    *****
     *    *****
     *    *****
     *    *****
     */
    private static void pattern1(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    /**
     *      *
     *      **
     *      ***
     *      ****
     *      *****
     */
    private static void pattern2(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n){
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void pattern5(int n){
        for (int i = 1; i<=2*n-1; i++){
            int totalCols = i > n ? 2 * n - i : i;
            for (int j = 1; j<=totalCols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern6(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*n-(2*i-1); k++){
                System.out.print("*");
            }

            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 1; i<=n; i++){
            for (int spaces = 1; spaces<=n-i; spaces++){
                System.out.print(" ");
            }
            for (int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }

            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*n-(2*i-1); k++){
                System.out.print("*");
            }
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = 1; i<=n; i++){
            int start = i%2==0 ? 0 : 1;
            for (int j=1; j<=i; j++){
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for (int spaces = 1; spaces<=2*(n-i); spaces++){
                System.out.print(" ");
            }

            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        int initialNumber = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(initialNumber+" ");
                initialNumber += 1;
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i = 1; i<=n; i++){
//            char alpha = 'A';
            for(char c = 'A'; c<'A'+i; c++){
                System.out.print(c+" ");
//                alpha += 1;
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        for (int i = 1; i<=n; i++){
            for (char c = 'A'; c<'A'+n-i+1; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern16(5);

    }
}
