public class perfectSquare {

    // check if given number is perfect square
    public static boolean checkPerfectSquare(int n) {
        int original = n;
        for (int i = 0; i * i <= n; i++) {
            if (i * i == original) {
                return true;

            }
        }
        return false;
    }

    // and using mathmethon
    public static boolean perfect(int n) {
        int sqr = (int) Math.sqrt(n);
        return sqr * sqr == n;

    }

    public static void main(String args[]) {
        int n = 25;
        // System.out.println(checkPerfectSquare(n));
        System.out.println(perfect(n));
    }

}

/*
 * Check if given number is perfect square
 * Last Updated : 17 Sep, 2024
 * Given a number n, check if it is a perfect square or not.
 * 
 * Examples :
 * 
 * Input : n = 36
 * Output : Yes
 * 
 * 
 * Input : n = 2500
 * Output : Yes
 * Explanation: 2500 is a perfect square of 50
 * 
 * 
 * Input : n = 8
 * Output : No
 * 
 * 
 * 
 */
