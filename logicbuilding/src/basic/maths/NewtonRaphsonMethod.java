package basic.maths;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(root(40));
    }
    static double root(int n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x));
            if (Math.abs(root  - x) < 1)
                break;
            x = root;
        }
        return root;
    }
}
