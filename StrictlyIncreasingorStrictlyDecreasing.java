public class StrictlyIncreasingorStrictlyDecreasing {
    /*
    Given a list of integers nums, 
    return whether the list is strictly increasing or 
    strictly decreasing.
    */
    private static boolean fun(int []nums){
        int n,inc,dec;
        n = nums.length;
        dec = 0;inc = 0;
        for(int i = 1; i < n; i++ ){
            if(nums[i]<nums[i-1]){
                dec++;
            }
            else if(nums[i]>nums[i-1]){
                inc++;
            }
        }
        if(inc == n-1 || dec == n-1) return true;
        return false;
    }
    public static void main(String[] args) {
        int []nums = {1,2,4,5,6};
        System.out.println(fun(nums));
    }
}
