import java.util.HashSet;

public class Shify5 {
    private static int fun(String s){
           int n,count;
           n = s.length();
           HashSet<Integer> set = new HashSet<>();
           char ch[] = s.toCharArray();
           count = 0;
           for(int i=0;i<n;i++){
               char temp = ch[i];
               for(char j = 48;j<=57;j++){
                    ch[i] = j;
                    String str = new String(ch);
                    int num = Integer.parseInt(str);
                    if(num%3==0 && !set.contains(num)){ count++; System.out.println(num);}
                    set.add(num);
                    
               }
               ch[i] = temp;
           }
        return count;
    }
    public static void main(String[] args) {
        String s = "1";
        System.out.println(fun(s));
    }
    
}
