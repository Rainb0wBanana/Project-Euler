public class Problem3 {

    // Problem 3: Largest prime factor
    // The prime factors of 13195 are 5, 7, 13 and 29.
    // What is the largest prime factor of the number 600851475143
    public static void main(String[] args) {
        long n = 600851475143L;
        for(long i = 2; i < n; ++i) {
            if(n % i == 0) {
                n /= i;
            }
        }
        System.out.println(n);
    }
}
