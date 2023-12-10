public class Problem2 {

    // Problem 2: Even Fibonacci numbers
    // Each new term in the Fibonacci sequence is generated by adding the previous
    // two terms. By starting with 1 and 2, the first 10 terms will be:
    //
    // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //
    // By considering the terms in the Fibonacci sequence whose values do not
    // exceed four million, find the sum of the even-valued terms.

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int sum = 0;
        while (b < 4000000) {
            int temp = a;
            a = b;
            b += temp;
            if (b % 2 == 0) {
                sum += b;
            }
        }
        System.out.println(sum);
    }

}
