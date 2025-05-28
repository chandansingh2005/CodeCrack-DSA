public class modularExponetiation {

    public static int exponentiation(int x, int y, int p) {
        int ans = 1;
        for (int i = 0; i < y; i++) {
            ans = (ans * x)%p;
        }
        return ans % p;
    }

    public static void main(String args[]) {
        int x = 2, y = 5, p = 13;
        System.out.println(exponentiation(x, y, p));
    }

}

/*
 * Modular Exponentiation is the process of computing: xy (mod  p). where x, y, and p are integers. It efficiently calculates the remainder when xy is divided by p or (xy) % p, even for very large y.
 
 Examples : 
 Input:  x = 2, y = 3, p = 5
 Output: 3
 Explanation: 2^3 % 5 = 8 % 5 = 3.
 
 Input:  x = 2, y = 5, p = 13
 Output: 6
 Explanation: 2^5 % 13 = 32 % 13 = 6.
 * 
 */
