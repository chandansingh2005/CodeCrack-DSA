public class pairCube {
    public static int pairCube(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (Math.pow(i, 3) + Math.pow(j, 3) == n) {
                    count++;

                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println(pairCube(12));
        
    }
    
}

/*
 Pair Cube Count
 Last Updated : 19 Mar, 2025
 Given n, count all ‘a’ and ‘b’ that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs
 
 Examples: 
 
 Input: n = 9
 Output: 2
 Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9
 
 
 Input: n = 28
 Output: 2
 Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28
 
 
 [Naive Approach] Using Nested Loops – O(n^2) time and O(1) space
 The approach uses a nested loop to check all pairs (a, b) where a3+b3=n. If the condition holds, the count is incremented.
 
 
  
 */