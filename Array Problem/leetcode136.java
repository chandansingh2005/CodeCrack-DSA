public class leetcode136 {

    // function
    public static int SingleNumber(int nums[]) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1 };
        int nums1[] = { 4, 1, 2, 1, 2 };
        // call the function
        System.out.println(SingleNumber(nums));
        System.out.println(SingleNumber(nums1));

    }

}
