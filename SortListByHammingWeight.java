import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortListByHammingWeight {
    private static int[] fun(int []nums){
           /* Arrays.sort(nums, new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                int c1 = Integer.bitCount(a);
                int c2 = Integer.bitCount(b);
                if(c1 <= c2) return 1;
                else return -1;
            }
        });*/


        return nums;
    }
    public static void main(String[] args) {
        int []nums = {4,1};
        fun(nums);
    }
    
}
