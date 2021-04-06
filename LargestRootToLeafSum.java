import java.util.ArrayList;
import java.util.List;

public class LargestRootToLeafSum {
    /*
    Given the root to a binary tree root,
     return the largest sum of any path that goes from the 
     root to a leaf.
    */
    public int solve(Tree root) {
        List<Integer> list = new ArrayList<>();
        if(root!=null) helper(root,list,0);
        else return 0;
        int max = list.get(0);
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        return max;
    }
    private void helper(Tree root,List<Integer>list,int sum){
        sum = sum+root.val; 
        if(root.left == null && root.right == null){
            list.add(sum);
            return;
        }
        if(root.left!=null)helper(root.left,list,sum);
        if(root.right!=null)helper(root.right,list,sum);
        return;
    }
    public static void main(String[] args) {
        
    }
}
 class Tree {
    int val;
    Tree left;
    Tree right;
}
