public class calculateNcr {

    // factorial function
    public static int fact(int n) {
        if (n == 1) {
            return 1;

        }
        return n * fact(n - 1);
    }

    // function in calculte value of nCr
    public static int nCrcalculate(int n, int r) {

        int step1 = fact(n);
        int step2 = fact(r) * fact(n - r);
        int ans = step1 / step2;
        return ans;
    }

    public static void main(String args[]) {
        int n = 5, r = 2;
        System.out.println(nCrcalculate(n, r));

    }

}

/*
 * 
 * Examples
 * nput: n = 5, r = 2
 * Output: 10
 * Explanation: The value of 5C2 is calculated as 5! / ((5−2)! * 2!​)= 10.
 * 
 * 
 * Input: n = 2, r = 4
 * Output: 0
 * Explanation: Since r is greater than n, thus 2C4 = 0
 * 
 * 
 * Input: n = 5, r = 0
 * Output: 1
 * Explanation: The value of 5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.
 */
