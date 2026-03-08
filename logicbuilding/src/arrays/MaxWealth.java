package arrays;

// Richest Customer Wealth
public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(richestPerson(accounts));
    }
    static int richestPerson(int [][]accounts){
        int maxWealth = Integer.MIN_VALUE;
        for (int []person : accounts){
            int personAccountsWealth = 0;
            for (int account : person){
                personAccountsWealth += account;
            }
            if (personAccountsWealth > maxWealth)
                maxWealth = personAccountsWealth;
        }
        return maxWealth;
    }
}
