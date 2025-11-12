package conditional_thinking;

public class Quadrants {
    public static void main(String[] args) {
        System.out.println("Enter Coordinates:(X,Y) ");
        int x = new java.util.Scanner(System.in).nextInt();
        int y = new java.util.Scanner(System.in).nextInt();
        System.out.println(getQuadrant(x,y));
    }
    private static String getQuadrant(int x , int y){
        if(x==0 && y==0)
            return "Lies in Origin";
        else if(x==0)
            return "Y Axis";
        else if (y==0)
            return "X Axis";
        else if(x>0 && y>0)
            return "Quadrant I";
        else if(x<0 && y>0)
            return "Quadrant II";
        else if (x<0 && y<0)
            return "Quadrant III";
        else
            return "Quadrant IV";
    }
}
