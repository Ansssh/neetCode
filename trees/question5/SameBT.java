package trees.question5;

import trees.definiton.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q == null)){
            return true;
        }
        if((p != null && q == null) || (p == null && q != null) || p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class SameBT {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isSameTree(new TreeNode(-1), new TreeNode(-1)));
    }
}
