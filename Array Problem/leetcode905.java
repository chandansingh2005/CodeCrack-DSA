public class leetcode905 {

    // function
     public  static int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[]={3,1,2,4};
        // function call
        System.out.println(sortArrayByParity(nums));

    }
    
}
