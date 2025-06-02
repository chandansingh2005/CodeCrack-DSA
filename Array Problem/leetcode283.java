public class leetcode283 {

    public  static void moveZeroes(int[] nums) {
        // if nums[0] return n
        if (nums.length == 1 ) {
            System.out.println(nums[0]);
        }
        // case 2 using two pointer approach
        int i = 0;// 
        for (int j = 0; j < nums.length; j++) {// loop is move on 0->n
        // check condtion if condition is corrent to swap and increase i
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }

    // print array
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");

        }
    }
    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        // call function
        System.out.println("before array");
        printArray(nums);
        System.out.println();
        moveZeroes(nums);
        System.out.println("after array");
        printArray(nums);
    }
    
}
