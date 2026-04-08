package trees.question2;

import trees.definiton.TreeNode;

class Solution {
    public int dfs(TreeNode root, int count){
        if (root == null) {
            return count;
        }
        return Math.max(dfs(root.left, count + 1), dfs(root.right, count + 1));
    }
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
}

public class Depth {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.maxDepth(new TreeNode(1, new TreeNode(2), new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5))))));
    }
}
