package trees.question8;

import java.util.*;
import trees.definiton.TreeNode;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public void dfs(Queue<TreeNode> queue){
        if (queue.isEmpty()) {
            return;
        }
        Queue<TreeNode> drill = new LinkedList<>();
        List<Integer> innerRes = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                return;
            }
            if (temp.left != null) {
                drill.add(temp.left);
            }
            if (temp.right != null) {
                drill.add(temp.right);
            }
            innerRes.add(temp.val);
        }
        res.add(innerRes);
        dfs(drill);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> imp = new LinkedList<>();
        imp.add(root);
        dfs(imp);
        return res;
    }
}


public class LevelOrder {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.levelOrder(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(7)))));
    }
}
