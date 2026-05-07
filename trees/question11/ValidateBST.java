package trees.question11;

import trees.definiton.*;

class Solution {
    boolean res = true;
    public void dfs(TreeNode root, int lowerLimit, int upperLimit){
        if (root == null) {
            return;
        }
        if (root.val <= lowerLimit || root.val >= upperLimit) {
            res = false;
            return;
        }
        dfs(root.left, lowerLimit, Math.min(upperLimit, root.val));
        dfs(root.right, Math.max(lowerLimit, root.val), upperLimit);

    }
    public boolean isValidBST(TreeNode root) {
        dfs(root, -1001, 1001);
        return res;
    }
}


public class ValidateBST {
    public static void main(String[] args) {
        Solution x = new Solution();
        // TreeNode tree = new TreeNode(5,new TreeNode(4, null, new TreeNode(3)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(x.isValidBST(tree));
    }
}
