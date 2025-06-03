public class leetcode485 {

    // function
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                ans=Math.max(ans,count);

            }else{
                count=0;
            }
            // edge case
            if(ans<count){
                ans=count;
            }
        }
        return ans;
    }    

    public static void main(String args[]){
        int nums[]={1,1,0,1,1,1};
        int nums1[]={1,0,1,1,0,1};
        // call function
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnes(nums1));

    }
    
}
