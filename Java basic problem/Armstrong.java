// Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

// abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....

// Here a, b, c and d are digits of input number abcd.....

// Examples

// Input:153
// Output: Yes
// Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153

// Input: 120
// Output: No
// Explanation: 120 is not a Armstrong number, 1*1*1 + 2*2*2 + 0*0*0 = 9

// Input: 1253
// Output: No
// Explanation: 1253 is not a Armstrong Number, 1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

// Input: 1634
// Output: Yes
// Explanation: 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634


// here the right  down the function 
public class Armstrong {
    // Program for Armstrong Number
    public static boolean Armstrong(int n) {
        int original = n;
        int result = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            result += Math.pow(lastdigit, 3);
            n /= 10;

        }
        return result == original;
    }

    public static void main(String args[]) {
        // call the function
        System.out.println(Armstrong(10));

    }

}
