import java.util.*;

public class LargestElement {

    // largest Element function
    public static int largest(int nums[]) {
        int n = nums.length;
        // Base case
        if (n == 0) {
            return  n;

        }
        int largeElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largeElement=Math.max(largeElement, nums[i]);
        }
        return largeElement;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 3, 6, 1 };
        int arr1[] = { 3, 3, 0, 99, -40 };
        int arr2[] = { 3 };
        // call the function
        System.out.println(largest(arr));
        System.out.println(largest(arr1));
        System.out.println(largest(arr2));
    }
}