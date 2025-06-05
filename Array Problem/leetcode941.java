public class leetcode941 {

    // function
     public  static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Step 1: Walk up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be first or last
        if (i == 0 || i == n - 1) return false;

        // Step 2: Walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // If we reached the end, it's valid
        return i == n - 1;
    }
    public static void main(String args[]){
        int nums[]={2,1};
        int nums2[]={0,3,2,1};
        // function call
        System.out.println(validMountainArray(nums));
        System.out.println(validMountainArray(nums2));

    }
}