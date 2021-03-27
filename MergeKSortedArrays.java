import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedArrays {
    private static int[] fun(int [][]lists){
        List<Integer> templist = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            for(int j=0;j<lists[i].length;j++){
                templist.add(lists[i][j]);
            }
        }
        int res[] = new int[templist.size()];
        for(int i=0;i<res.length;i++){
            res[i] = templist.get(i);
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        
    }
    
}
