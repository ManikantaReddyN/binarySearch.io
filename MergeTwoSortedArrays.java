public class MergeTwoSortedArrays {
    private static int[] fun(int []a,int []b){
        int n = a.length+b.length;
        int res [] = new int[n];
        int first,second,i;
        first = a.length-1;
        second = b.length-1;
        i = n-1;
        while(i>=0 && first>=0 && second>=0){
            if(a[first]>=b[second]) res[i--] = a[first--];
            else res[i--] = b[second--];
        }
        while(first>=0){ res[i--] = a[first--];}
        while(second>=0){ res[i--] = b[second--];}
        
        return res;
    }

    public static void main(String[] args) {
      int []a = {5, 10, 15};
      int []b = {3, 8, 9};
      System.out.println(fun(a, b));
    }
}
