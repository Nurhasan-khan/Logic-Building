package conditional_thinking;

public class VotingEligibility {
    public static void main(String[] args) {
        System.out.println("Enter Your Age: ");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println(getEligibility(age));

    }
    private static String getEligibility(int age){
        if(age >= 18)
            return "You are eligible to vote.";
        else
            return "You are not eligible to vote."+"\n"
                    +"Please Wait for "+(18-age)+" years to be eligible to vote.";
    }
}
