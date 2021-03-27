import java.util.ArrayList;
import java.util.List;

public class AsciiStringToInteger {
    private static int fun(String s){
        List<Integer> list = new ArrayList<>();
        int a,b,num,res;
        a = 0;b = 10;num = 0;
        for(char ch:s.toCharArray()){
            if(ch >= 48 && ch <= 57){
                a = ch-'0';
                num = num*b+a;
                System.out.println(num);
            }
            else{
                if(num>0) list.add(num);
                b = 10;
                num = 0;
            }
        }
        if(num > 0) list.add(num);
        res = 0;
        System.out.println(list);
        for(Integer i: list){
            res = res+(int)i;
        }
        System.out.println("res:"+ res);
        return res;
    }
    public static void main(String[] args) {
        String s = "101";
        fun(s);
    }
    
}
