public class PalindromicAnagram {
    private static boolean fun(String s){
        int a[] = new int[26];
        for(char ch:s.toCharArray()){
            a[ch-'a']++;
        }
        boolean odd = false;
        for(int i=0;i<26;i++){
            if(a[i]%2!=0){
                if(odd == false) odd = true;
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "carrae";
        System.out.println(fun(s));
    }
    
}
