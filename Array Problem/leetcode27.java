public class leetcode27 {

    // function
     public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }


    public static void main(String args[]){
        int nums[]={3,2,2,3}, val = 3;
        int nums2[]={0,1,2,2,3,0,4,2},val2=2;
        // function call
        System.out.println(removeElement(nums, val));
        System.out.println(removeElement(nums2, val2));
    }
    
}
