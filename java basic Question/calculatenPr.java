public class calculatenPr {

    // factorial function
    public static int factorial(int n) {
        if (n == 1) {
            return 1;

        }

        return n * factorial(n - 1);
    }

    // function in calculate the value of nPr
    public static int nPrcalculate(int n, int r) {

        int first = factorial(n);
        int second = factorial(n - r);
        return first / second;
    }

    public static void main(String args[]) {
        int n = 6, r = 3;
        System.out.println(nPrcalculate(n, r));
    }
}

/*
 * Program to calculate the value of nPr
 * Last Updated : 19 Mar, 2025
 * Given two numbers, n and r, the task is to compute nPr, which represents the
 * number of ways to arrange r elements from a set of n elements. It is
 * calculated using the formula n!/(n−r)!, where “!” denotes the factorial
 * operation.
 * 
 * nPr = n! / (n – r)!
 * 
 * 
 * Examples:
 * 
 * Input: n = 5
 * r = 2
 * Output: 20
 * Explanation: 5P2 = 5! / (5 – 2)! = 20
 * 
 * Input: n = 6
 * r = 3
 * Output: 120
 * Explanation: 6P3 = 6! / (6 – 3)! = 120
 * 
 */
