package trees.question1;

import trees.definiton.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

public class InvertTree {
    public static void main(String[] args) {
        Solution x = new Solution();
        TreeNode p = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        TreeNode.printTree(p);
        System.out.println();
        TreeNode.printTree(x.invertTree(p));
        
    }
}
