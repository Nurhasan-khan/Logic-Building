package conditional_thinking;
//Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the
//origin
public class Axis {
    public static void main(String[] args) {
        System.out.println("Enter Coordinates (x and y): ");
        int x = new java.util.Scanner(System.in).nextInt();
        int y = new java.util.Scanner(System.in).nextInt();
        System.out.println(getAxis(x, y));
    }
    private static String getAxis(int x, int y){
        if (x == 0 && y == 0)
            return "Lies at Origin";
        else if (x == 0)
            return "Lies on Y Axis";
        else if (y == 0)
            return "Lies on X Axis";
        return null;
    }
}
