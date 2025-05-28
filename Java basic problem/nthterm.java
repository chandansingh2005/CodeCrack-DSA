public class nthterm {
    // find the nth term
    public static int nthTermseries(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        return ans;
    }
    
    public static void main(String args[]){
        System.out.println(nthTermseries(5));
        
    }
    
}
/*
Find n-th term of series 1, 3, 6, 10, 15, 21…
Last Updated : 21 Mar, 2025
Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21…

Examples

Input  3
Output 6


Input  4
Output  10


The given series represent triangular numbers which are sums of natural numbers.

[Naive approach] Using Loop – O(n) time and O(1) space
The series sums the first n natural numbers, with each term adding one more number. The nth term is the sum of the first n natural numbers.
*/