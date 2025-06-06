import java.util.Arrays;

public class leetcode977 {

    // function
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int square[]=new int[n];
        for(int i=0;i<n;i++){
            square[i]=nums[i]*nums[i];
        }
        Arrays.sort(square);
        return square;
    }

    public static void main(String args[]){
        int nums[]={-4,-1,0,3,10};
        // function call
        System.out.println(sortedSquares(nums));
    }
    
}
