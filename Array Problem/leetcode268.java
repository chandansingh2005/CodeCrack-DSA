public class leetcode268 {

    // function
    public  static int missingNumber(int[] nums) {
        int n=nums.length;
        int esum=n*(n+1)/2;// this line calculate the esul sum
        int  sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];// this line calculate the sum
        }
        return esum-sum;
    }
    public static void main(String args[]){
        int nums[]={3,0,1};
        int nums1[]={0,1};
        // function call
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums1));

    }
    
}
