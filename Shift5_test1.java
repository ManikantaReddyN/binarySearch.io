import java.util.HashSet;

public class Shift5_test1 {
    private static int fun(String s){
          int n,count;
          n = s.length();
          HashSet<String> set = new HashSet<>();
          count = 0;
          char ch[] = s.toCharArray();
          int total = fun2(s);
          for(int i=0;i<n;i++){
                char temp = ch[i];
                int sum = total - (temp - '0');
                int div = sum%3;
                for(int j = (div == 0?div:3-div);j<=9;j = j+3){
                    ch[i] = (char)(j+'0');
                    String str = new String(ch);
                    if(!set.contains(str)) count++;
                    set.add(str);
                    
                }
                ch[i] = temp;

          }

        return count;
    }
    private static int fun2(String s){
        int res = 0;
        for(char ch:s.toCharArray()){
            res = res+(ch - '0');
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "022";
        System.out.println(fun(s));
    }
    
}
