public class Palindrome {

    // Function to check if the number is palindrome
    public static boolean checkPalidrome(int n) {

        int reverse = 0;
        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = Math.abs(n);

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;

        }
        return (reverse == Math.abs(n));

    }

    public static void main(String args[]) {
        int n = 1221;
        if (checkPalidrome(n) == true) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }

}

/*
 * 
 * Check if a number is Palindrome
 * Last Updated : 15 Feb, 2025
 * Given an integer n, find whether the number is Palindrome or not. A number is
 * a Palindrome if it remains the same when its digits are reversed.
 * 
 * Examples:
 * 
 * Input: n = 12321
 * Output: Yes
 * Explanation: 12321 is a Palindrome number because after reversing its digits,
 * the number becomes 12321 which is the same as the original number.
 * 
 * 
 * Input: n = 1234
 * Output: No
 * Explanation: 1234 is not a Palindrome number because after reversing its
 * digits, the number becomes 4321 which is different from the original number.
 * 
 * 
 */
