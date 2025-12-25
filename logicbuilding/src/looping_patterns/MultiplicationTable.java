package looping_patterns;
//Q.Print the table of a given number (n × 1 to n × 10).
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
