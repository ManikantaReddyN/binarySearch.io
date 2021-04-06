public class SmallestNumberWithNoAdjacentDuplicates {
    /*
    
    You are given a string s containing "1", "2", "3" and "?".
     Given that you can replace any “?” with "1", "2" or "3",
      return the smallest number you can make as a string such 
      that no two adjacent digits are the same.
    */
    private static String fun(String s){
         int n;
         n = s.length();
         char ch[] = s.toCharArray();
         for(int i=0;i<n;i++){
             if(ch[i] != '?'){
             }
             else{
                int can = 1;
                while(true){
                    if(i>0 && (ch[i-1]-'0') == can){
                        System.out.println("in if");
                        can++;
                        continue;
                    }
                    System.out.println("in else"+" "+(i+1));
                    if((i+1) < ch.length && (ch[i+1]-'0') == can){
                        System.out.println("in se if");
                        can++;
                        continue;
                    }
                    break;
                    
                }
                ch[i] = (char)(can+'0');
             }
         }
         
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "3?2??";
        System.out.println(fun(s));
        
    }
}
