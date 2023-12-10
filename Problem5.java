public class Problem5 {

    // Problem 5: Smallest multiple
    // 2520 is the smallest number that can be divided by each of the numbers from
    // 1 to 10 without any remainder.
    // What is the smallest positive number that is evenly divisible by all of the
    // numbers from 1 to 20?

    public static void main(String[] args) {
        int i = 1;
        while(true) {
            if(isDivisible(i)) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    private static boolean isDivisible(int n) {
        for(int i = 1; i <= 20; ++i) {
            if(n % i != 0) {
                return false;
            }
        }
        return true;
    }

}
