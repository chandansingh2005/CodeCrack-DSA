
// first line is create a class
public class sumofDigit {
    // this is the function of sumofDigit
    public static int sumOfnumber(int n) {
        int sum = 0;// variable 
        // condition 
        while (n != 0) {
            // find the last digit
            int lastdigit = n % 10;
            sum += lastdigit;
            n /= 10;
        }
        return sum;
    
}
public static void main(String args[]){
    System.out.println(sumOfnumber(121));

    
    
}
}

// Sum of Digits of a Number
// Last Updated : 07 Feb, 2025
// Given a number n, find the sum of its digits.

// Examples : 

// Input: n = 687
// Output: 21
// Explanation: The sum of its digits are: 6 + 8 + 7 = 21


// Input: n = 12
// Output: 3
// Explanation: The sum of its digits are: 1 + 2 = 3
