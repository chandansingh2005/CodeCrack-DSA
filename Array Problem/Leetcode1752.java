public class Leetcode1752 {

    // create the function
    public  static boolean check(int[] nums) {
        int n = nums.length;// this is length
        int count=0;// store the element
        for (int i = 0; i < n; i++) { // loop is move to 0-->n
            if (nums[i]>nums[(i + 1)%n]) { // check the condition
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]){
        // given the array
        int arr[]={3,4,5,1,2};
        // call the function
        System.out.println(check(arr));
        
    }
}