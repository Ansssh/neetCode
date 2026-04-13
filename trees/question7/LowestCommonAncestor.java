package trees.question7;

import trees.definiton.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if(root == p || root == q){
            return root;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Solution x = new Solution();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        h.left = g;
        h.right = f;
        a.right = b;
        c.left = a;
        c.right = d;
        e.left = c;
        e.right = h;
        TreeNode.printTree(x.lowestCommonAncestor(e, c, d));
    }
}
