public class Panagram {
    private static boolean fun(String s){
        int a[] = new int[26];
        for(char ch:s.toCharArray()){
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                if(ch>=65 && ch<=90) a[(ch-'a')+32]++;
                else a[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(a[i]==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
    
}
