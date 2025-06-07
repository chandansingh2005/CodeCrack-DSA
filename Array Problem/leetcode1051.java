import java.util.Arrays;

public  class leetcode1051 {
    // function
    public static int heightChecker(int[] heights) {
        int count=0;
        int expected[]=heights.clone();// clone is create a copy same array same value 
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int heights[]={1,1,4,2,1,3};
        // function call
        System.out.println(heightChecker(heights));
    
}

    
}
