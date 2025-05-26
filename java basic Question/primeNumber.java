public class primeNumber {

    // function name
    public static boolean primeNumber(int n) {
        if (n == 1 || n == 2) {
            return true;

        }
        // 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }        
    public static void main(String args[]){
        System.out.println(primeNumber(12));
    
    }
    
}

// Introduction to Primality Test and School Method
// Last Updated : 13 Feb, 2025
// Given a positive integer, check if the number is prime or not. A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Examples of the first few prime numbers are {2, 3, 5, ...}
// Examples : 

// Input:  n = 11
// Output: true

// Input:  n = 15
// Output: false

// Input:  n = 1
// Output: false 
