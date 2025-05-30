public class factorialNumber {

    // write down the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;

        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        System.out.println(factorial(5));
        
    }
    
}

// Factorial of a Number
// Last Updated : 13 Nov, 2024
// Given the number n (n >=0), find its factorial. Factorial of n is defined as 1 x 2 x … x n. For n = 0, factorial is 1. We are going to discuss iterative and recursive programs in this post.

// Examples:

// Input: n = 5
// Output: 120
// Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120


// Input: n = 4
// Output: 24
// Explanation: 4! = 4 * 3 * 2 * 1 = 24


// Input: n = 0
// Output: 1


// Input: n = 1
// Output: 1
