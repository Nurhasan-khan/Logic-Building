package basic.maths;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
//        primeTillN(40);
        int n = 40;
        boolean[] primes = new boolean[n+1];
        allPrimes(n,primes);
    }
    static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i*i<=n; i++){
            if (n%i == 0) {
                count++;
                if (n/i != i)
                    count++;
            }
        }
        return count == 2;
    }
    static void primeTillN(int n){
        for (int i = 2; i<n; i++){
            System.out.println(i+" : "+isPrime(i));
        }
    }

    // sieve of Eratosthenes
    static void allPrimes(int n , boolean[]primes){
        for (int i = 2; i*i<=n; i++){
            if (!primes[i]){
                for (int j = i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i<=n; i++){
            if(!primes[i]) {
                System.out.print(i + ",");
            }
        }
    }
}
