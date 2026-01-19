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

    public static void main(String[] args) {
        pattern7(5);

    }
}
