public class leetcode1299 {

    // function
     public  static int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=max;
            if(curr>max){
                max=curr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        // function call
    }
    
}
