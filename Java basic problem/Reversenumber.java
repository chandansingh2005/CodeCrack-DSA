public class Reversenumber {
    public static void main(String args[]) {
        System.out.println("hello");
        int n = 122;
        int revNum = 0;
        while (n > 0) {
            // int lastdigit = n % 10;
            revNum = revNum * 10 + n%10;
            n /= 10;

        }
        System.out.print(revNum);
    }
    
   

}

// Given an Integer n, find the reverse of its digits.

// Examples:  

// Input: n = 122
// Output: 221
// Explanation: By reversing the digits of number, number will change into 221.


// Input: n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.


// Input: n = 12345 
// Output: 54321
// Explanation: By reversing the digits of number, number will change into 54321.



