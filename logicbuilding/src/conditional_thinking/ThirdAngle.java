package conditional_thinking;
//Take two angles of a triangle and compute the third angle
public class ThirdAngle {
    public static void main(String[] args) {
        System.out.println("Enter Two Angles of a Triangle: ");
        int angle1 = new java.util.Scanner(System.in).nextInt();
        int angle2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("The Third Angle is: "+ findThirdAngle(angle1,angle2));
    }
    private static int findThirdAngle(int angle1, int angle2){
        if((angle1+angle2) >= 180 || angle1 <=0 || angle2 <=0){
            System.out.println("Invalid Angles for a Triangle");
            return -1;
        }
        return 180 - (angle1+angle2);
    }
}
