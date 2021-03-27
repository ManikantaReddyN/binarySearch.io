public class GuessTheRoot {
    /*
    Given a non-negative integer n, find a number r such that r * r = n 
    and round down to the nearest integer.

Can you implement this without using the built-in square root?
    */
    private static int fun(int n){
        if(n == 0 || n == 1)return n;
        long  left,right,mid,res; // long for very large integers
        left = 1;
        right = n;
        res = 0;
        while(left<=right){
            mid = (left+right)/2;
            if(mid*mid == n) return (int)mid;
            if(mid*mid < n){
                left = mid+1;
                res = mid;
            }
            else{
                right = mid-1;
            }
        }
        return (int)res;
    }
    public static void main(String[] args) {
        int n = 46510552;
        System.out.println(fun(n));
    }
    
}
