public class secondlargestElement {

    // FUNCTION
    public static int secondLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);

        }
        for (int i = 0; i < nums.length; i++) {
            if (secondlarge < nums[i] && largest != nums[i]) {
                secondlarge = nums[i];

            }
        }
        return secondlarge;

    }

    public static void main(String args[]) {
        int nums[] = { 8, 8, 7, 6, 5 };
        int nums2[] = { 10, 10, 10, 10 };
        int nums3[] = { 5, 10, 10 };
        // call the function
        System.out.println(secondLargest(nums));
        System.out.println(secondLargest(nums2));
        System.out.println(secondLargest(nums3));
        
    }

}
