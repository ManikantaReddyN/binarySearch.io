import java.util.PriorityQueue;

public class MergeKSortedArraysMeth_2 {
    private static int[] fun(int [][]lists){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a-b));
        for(int i=0;i<lists.length;i++){
            for(int j=0;j<lists[i].length;j++){
                pq.add(lists[i][j]);
            }
        }
        int n = pq.size();
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = pq.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
    
}
