package trees.question10;

import trees.definiton.*;

class Solution {
    int goodNodes = 0;
    public void dfs(TreeNode root, int currMax){
        if (root == null) return;
        if(root.val >= currMax){
            currMax = root.val;
            goodNodes++;
        }
        dfs(root.left, currMax);
        dfs(root.right, currMax);
    }
    public int goodNodes(TreeNode root) {
        dfs(root, -101);
        return goodNodes;
    }
}

public class GoodNodes {
    public static void main(String[] args) {
        
    }
}
