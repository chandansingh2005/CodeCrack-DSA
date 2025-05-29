public class perfectcube {
    // funnction in check if given number is perfect cube
    public static boolean isPerfectCube(int n) {

        for (int i = 0; i * i * i <= n; i++) {
            if (i * i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 216;
        System.out.println(isPerfectCube(n));

    }

}

/*
 * Check if given number is perfect cube
 * Last Updated : 09 Jan, 2025
 * Given a number N, the task is to check whether the given number N is a
 * perfect cube or not.
 * Examples:
 * 
 * Input: N = 216
 * Output: Yes
 * Explanation:
 * As 216 = 6*6*6. Therefore the cube root of 216 is 6.
 * 
 * 
 * Input: N = 100
 * Output: No
 * 
 * 
 * 
 */
