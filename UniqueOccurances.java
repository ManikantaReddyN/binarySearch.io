import java.util.HashMap;

public class UniqueOccurances {
    private static boolean fun(int []nums){
          HashMap<Integer,Integer> map = new HashMap<>();
          HashMap<Integer,Integer> count = new HashMap<>();
          for(int i:nums){
              map.put(i, map.getOrDefault(i, 0)+1);
          }
          System.out.println(map);
          for(int i:map.values()){
              System.out.println(i);
              count.put(i,count.getOrDefault(i, 0)+1);
          }
          System.out.println(count);
          for(int i:count.values()){
            if(i>1) return false;
          }
          
        return true;
    }
    public static void main(String[] args) {
        int []nums = {5,3,1,8,3,1,1,8,8,8,1};
        System.out.println(fun(nums));
    }
    
}
