package basic.maths;

class SmallestDivisibleDigit {
    public static void main(String[] args) {
        System.out.println(smallestNumber(1,6));
    }
    public  static int smallestNumber(int n, int t) {
        int product = 1;
        while (true){
            int newN = n;
            product = 1;
            while(newN != 0){
                int rem = newN % 10;
                product = product * rem;
                newN = newN/10;
            }
            if(product % t == 0) break;
            n++;
        }
        return n;
    }
}