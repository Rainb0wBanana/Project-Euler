public class Problem4 {

    // Problem 4: Largest palindrome product
    // A palindromic number reads the same both ways. The largest palindrome made
    // from the product of two 2-digit numbers is 9009 = 91 × 99.
    // Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args) {
        long i = 100;
        long max = 0;

        while(i <= 999) {
            long j = 100;
            while (j <= 999) {
                if(isPalindrome(i*j)) {
                    if(i*j > max) {
                        max = i*j;
                    }
                }
                j++;
            }
            i++;
        }
        System.out.println(max);
    }

    private static boolean isPalindrome(long product) {
        long n = product;
        long reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return reverse == product;
    }
}
