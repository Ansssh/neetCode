package trees.question4;

import trees.definiton.TreeNode;

class Solution {
    public int dfs(TreeNode root){
        
        if (root == null) {
            return 0;
        }else{
            int left = dfs(root.left);
            int right = dfs(root.right);
            if (left == -1 || right == -1) {
                return -1;
            }
            if (Math.abs(right - left) > 1) {
                return -1;
            }
            return 1 + Math.max(left, right);
        }
    }
    public boolean isBalanced(TreeNode root) {
        return dfs(root) == -1 ? false : true;
    }
}

public class BalancedBT {
    public static void main(String[] args) {
        Solution x = new Solution();
    //     System.out.println(x.isBalanced(
    //         new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4))))));
        System.out.println(x.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(2))));
    }
        
}
