package trees.question3;

import trees.definiton.TreeNode;

class Solution {
    int diameter = 0;
    public int dfs(TreeNode root){
        if (root == null) {
            return 0;
        }else{
            int left = dfs(root.left);
            int right = dfs(root.right);
            diameter = Math.max(diameter, left + right);
            return 1 + Math.max(left, right);
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        System.out.println(dfs(root));
        return diameter;
    }
}


public class Diameter {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5))))));
    }
}
