public class perfectnumber {

    // perfect number
    public static boolean perfectNumber(int n) {
        int num = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                num += i;

            }

        }
        return num == n;
    }
    public static void main(String args[]){
        System.out.println(perfectNumber(122));

    }
    
}
/*
  A number is a perfect number if is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the number itself. The task is to find whether a given positive integer n is perfect or not.
  Examples: 
  
  Input: n = 15
  Output: false
  Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.
  
  Input: n = 6
  Output: true
  Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.
 
 */
