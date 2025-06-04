public class leetcode1281 {

    // function
    public  static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int result=0;
        while(n!=0){
            int lastdigit=n%10;
            sum+=lastdigit;
            product*=lastdigit;

            n/=10;
        }
        result= product-sum;
        
        return result;
    }
    
    public static void main(String args[]){
        int n=234;
        // function call
        System.out.println(subtractProductAndSum(n));

    }
}