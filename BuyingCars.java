import java.util.PriorityQueue;

/*
Given a list of integers prices representing prices of cars for sale, 
and a budget k, return the maximum number of cars you can buy.
*/
public class BuyingCars {
    private static int fun(int []prices,int k){
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a-b));
        for(int i:prices){
            pq.add(i);
        }
        System.out.println(pq);
        while(!pq.isEmpty()){
            k = k-pq.poll();
            System.out.println(k);
            if(k >= 0) count++;
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        int []prices = {60, 90, 55, 75};
        int k = 50;
        System.out.println(fun(prices, k));
    }
}
