public class FirstFitRoom {
    private static int fun(int []nums,int target){
        for(int i:nums){
            if(i >= target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}
