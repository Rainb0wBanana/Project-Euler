import java.math.BigInteger;

public class Problem16 {

    // Problem 16: Power digit sum
    // 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    // What is the sum of the digits of the number 2^1000?

    public static void main(String[] args) {
        // Getting 2^1000 in Java
        BigInteger n = BigInteger.valueOf(2);
        n = n.pow(1000);
        // convert to string to get the digits by character
        String s = n.toString();
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i < s.length(); i++) {
            // get the ith character of the string
            char c = s.charAt(i);
            // convert the character to a BigInteger value minus the ASCII value of '0' to get the actual value or 48
//            BigInteger b = BigInteger.valueOf(c - '0');
            BigInteger b = BigInteger.valueOf(c - 48);
            sum = sum.add(b);

        }
        // print the sum
        System.out.println(sum);
    }
}
