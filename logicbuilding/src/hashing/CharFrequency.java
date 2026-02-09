package hashing;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine().toLowerCase();
        int []hash = new int[26];
        for (int i = 0; i<s.length(); i++){
            hash[s.charAt(i) - 'a'] += 1;
        }
        System.out.println("Enter no of queries: ");
        int q = sc.nextInt();
        while (q-- != 0){
            char c = sc.next().charAt(0);
            System.out.print(hash[c - 'a']);
        }

//        for (int i = 0; i<q; i++){
//            char c = sc.next().charAt(0);
//            System.out.println(getFreq(c,s));
//        }
    }


    static int getFreq(char c , String s){
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }
}
