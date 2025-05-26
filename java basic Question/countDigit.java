public class countDigit {

    // function count digit
    public static int NumberCount(int n) {
        int temp = n;
        int count = 0;
        while (temp != 0) {
            int lastdigit = temp % 10;
            count++;
            temp /= 10;

        }
        return count;
    }

    public static void main(String args[]) {
        int n = 58964;
        // call the function
        System.out.println(NumberCount(n));
    }

}
/*
 * 
 * Given a number n, the task is to return the count of digits in this number.
 * 
 * Example:
 * 
 * Input: n = 1567
 * Output: 4
 * Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
 * 
 * 
 * Input: n = 255
 * Output: 3
 * Explanation: The are 3 digits in 256, which are 2, 5 and 5.
 * 
 * 
 * Input: n = 58964
 * Output: 5
 * Explanation: There are 5 digits in 58964, which are 5, 8, 9, 6 and 4.
 */
