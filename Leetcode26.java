public class Leetcode26 {
    // function 
     public  static int removeDuplicates(int[] nums) {
        int i=0;
        // using two pointer approach
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    // main function

    public static void main(String args[]){
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        // function call
        System.out.println(removeDuplicates(arr));
    }
    
}
