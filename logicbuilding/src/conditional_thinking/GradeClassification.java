package conditional_thinking;

public class GradeClassification {
    public static void main(String[] args)
    {
        System.out.println("Enter the marks obtained: ");
        double input = new java.util.Scanner(System.in).nextDouble();
        System.out.println("The grade is: " + classifyGrade(input));
    }
        private static String classifyGrade(double marks){
        if(marks >= 90.0)
            return "A";
        else if (marks >= 75.0)
            return "B";
        else if (marks >= 60.0)
            return "C";
        else if (marks >= 30.0)
            return "D";
        else
            return "F";
        }
}
