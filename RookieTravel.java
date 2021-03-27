class RookieTravel{
    private static boolean fun(String s){
        char ch[] = s.toCharArray();
        int left,right;
        boolean lwall,rwall;
        lwall = rwall = false;
        left = 0; right = ch.length-1;
        while(left<=right){
            if(ch[left] == '.') left++;
            if(ch[right] == '.') right--;
            if(ch[left] == 'B') {lwall = true; left++;};
            if(ch[right] == 'B') {rwall = true; right--;}
            if(ch[left] == 'R' || ch[right] == 'R'){
                if(lwall == false || rwall == false) return true;
                else return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "....B......B....";
        System.out.println(fun(s));
    }
}