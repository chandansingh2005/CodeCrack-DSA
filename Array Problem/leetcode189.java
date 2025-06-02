public class leetcode189 {

    // function in reverse array
    public static void roted(int nums[], int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);// reverse all array
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    // reverse function
    public static void reverse(int nums[], int left, int right) {

        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;

        }
    }

    // print array
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");

        }
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 }, k = 3;
        // function call
        roted(nums, k);
        printArray(nums);
    }
}