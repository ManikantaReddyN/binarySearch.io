public class OddNumberOfDigits {
    private static int fun(int []nums){
        int n,count,res;
        res = 0;
        for(int i:nums){
             n = i;
             count = 0;
            while(n > 0){
                n = n/10;
                count++;
            }
            if(count%2!=0) res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums = {1,800,2,10,3};
        System.out.println(fun(nums));
    }
    
}
