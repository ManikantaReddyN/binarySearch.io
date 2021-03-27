import java.util.Stack;

public class MinimumBracketAddition {
    /*
    Given a string s containing brackets ( and ),
     return the minimum number of brackets that can be inserted so
      that the brackets are balanced.
    */
    private static int fun(String s){
        int count = 0;
         Stack<Character> st = new Stack<>();
         for(char i:s.toCharArray()){
             if(i == ')' ){
                if(!st.isEmpty()) st.pop();
                else count++;
             }
             else st.push(i);
         }
         count += st.size();
        return count;
    }
    public static void main(String[] args) {
        String s = ")))((";
        System.out.println(fun(s));
    }
}
