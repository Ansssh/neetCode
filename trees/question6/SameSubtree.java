package trees.question6;

import java.util.ArrayList;

import trees.definiton.TreeNode;

class Solution {
    ArrayList<TreeNode> help;  
    Solution(){
        help = new ArrayList<>();
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q == null)){
            return true;
        }
        if((p != null && q == null) || (p == null && q != null) || p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public void dfs(TreeNode root, int val){
        if(root == null){
            return;
        }
        if(root.val == val){
            help.add(root);
        }
        dfs(root.left, val);
        dfs(root.right, val);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        dfs(root, subRoot.val);
        for(TreeNode x : help){
            if(isSameTree(x, subRoot)){
                return true;
            }
        }
        return false;
    }
}

public class SameSubtree {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isSubtree(new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(2, new TreeNode(4), new TreeNode(5)), null), new TreeNode(5)), new TreeNode(3)), new TreeNode(2, new TreeNode(4), new TreeNode(5))));
    }
}
