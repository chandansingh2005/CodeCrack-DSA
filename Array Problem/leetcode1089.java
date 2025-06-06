public class leetcode1089 {

    // function 
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count zeros (but only up to the last index that can be used)
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            int newIndex = i + zeros;
            if (newIndex < n) {
                arr[newIndex] = arr[i];
            }

            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
        }
    }
}

    public static void main(String args[]){
        int nums[]={1,0,2,3,0,4,5,0};
        // function call
        duplicateZeros(nums);


    }
}