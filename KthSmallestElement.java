import java.util.PriorityQueue;

public class KthSmallestElement {
    /*
      Given a list of unsorted integers nums, and an integer k,
       return the kth (0-indexed) smallest element in the list.

This should be done in \mathcal{O}(n)O(n) time on average.
    */
    private static int fun(int []nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int []nums = {};
    }
}
